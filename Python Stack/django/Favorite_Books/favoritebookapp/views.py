from django.shortcuts import render, redirect
from django.contrib import messages
from .models import User, Book

def index(request):
    return render(request, 'Registration.html')

def register(request):
    if request.method == 'POST':
        errors = User.objects.validate_registration(request.POST)
        if errors:
            for msg in errors.values():
                messages.error(request, msg)
            return redirect('/')
        user = User.objects.create_user(request.POST)
        request.session['user_id'] = user.id
        return redirect('/books')
    return redirect('/')

def login(request):
    if request.method == 'POST':
        success, result = User.objects.authenticate_user(request.POST['email'], request.POST['password'])
        if success:
            request.session['user_id'] = result.id
            return redirect('/books')
        else:
            messages.error(request, result)
    return redirect('/')

def logout(request):
    request.session.flush()
    return redirect('/')

def books(request):
    if 'user_id' not in request.session:
        return redirect('/')
    context = {
        'user': User.objects.get(id=request.session['user_id']),
        'books': Book.objects.all()
    }
    return render(request, 'Add_Books.html', context)

def add_book(request):
    if request.method == 'POST':
        errors = Book.objects.validate_book(request.POST)
        if errors:
            for msg in errors.values():
                messages.error(request, msg)
            return redirect('/books')
        user = User.objects.get(id=request.session['user_id'])
        book = Book.objects.create(
            title=request.POST['title'],
            description=request.POST['description'],
            uploaded_by=user
        )
        book.users_who_like.add(user)  
    return redirect('/books')

def view_book(request, book_id):
    if 'user_id' not in request.session:
        return redirect('/')
    context = {
        'user': User.objects.get(id=request.session['user_id']),
        'book': Book.objects.get(id=book_id)
    }
    return render(request, 'View_Book.html', context)

def favorite_book(request, book_id):
    user = User.objects.get(id=request.session['user_id'])
    book = Book.objects.get(id=book_id)
    book.users_who_like.add(user)
    return redirect('/books')

def unfavorite_book(request, book_id):
    user = User.objects.get(id=request.session['user_id'])
    book = Book.objects.get(id=book_id)
    book.users_who_like.remove(user)
    return redirect('/books')

def edit_book(request, book_id):
    book = Book.objects.get(id=book_id)
    if request.method == 'POST':
        errors = Book.objects.validate_book(request.POST)
        if errors:
            context = {'errors': errors, 'book': book}
            return render(request, 'Edit_Book.html', context)
        book.title = request.POST['title']
        book.description = request.POST['description']
        book.save()
        return redirect(f'/books/{book_id}/')
    context = {'book': book}
    return render(request, 'Edit_Book.html', context)

def delete_book(request, book_id):
    book = Book.objects.get(id=book_id)
    book.delete()
    return redirect('/books')
