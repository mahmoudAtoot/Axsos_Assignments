from django.shortcuts import render , redirect
from . import models
# Create your views here.
def index(request):
    return render(request , 'index.html')

def books(request):
    context={
        'books':models.Book.show_book()
        }
    return render(request, 'books.html', context)

def add_book(request):
    if request.method =='POST':
        models.Book.add_book(request.POST)
        return redirect('/books')
    return redirect('/')


def authors(request):
    context={
        'authors':models.Author.show_author()
        }
    return render(request , 'authors.html' , context)

def add_author(request):
    if request.method =='POST':
        models.Author.add_author(request.POST)
        return redirect('/authors')
    return redirect('/')

def book_detail(request ,id):
    context={ 
        'book' :models.Book.get_book_by_id(id),
        'authors':models.Author.show_author()
    }
    return render(request,'books_details.html',context)
 
def author_detail(request ,id):
    context={
          
        'author' :models.Author.get_author_by_id(id),
        'books':models.Book.show_book()
     }
    return render(request,'authors_details.html',context)

def connection_with_author(request , id):
        if request.method =='POST':
            models.Book.connection_with_author(request.POST , id)
        return redirect(f'/books/{id}')
    
    
def connection_with_book(request , id):
        if request.method =='POST':
            models.Author.connection_with_book(request.POST , id)
        return redirect(f'/authors/{id}')
