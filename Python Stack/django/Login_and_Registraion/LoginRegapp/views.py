from django.shortcuts import render, redirect
from django.contrib import messages
from .models import User

def index(request):
    return render(request, 'Registration.html')

def register(request):
    if request.method == "POST":
        errors = User.objects.validate_registration(request.POST)
        if errors:
            for msg in errors.values():
                messages.error(request, msg)
            return redirect('/')
        user = User.objects.create_user(request.POST)
        request.session['user_id'] = user.id
        return redirect('/success')
    return redirect('/')

def login(request):
    if request.method == "POST":
        success, result = User.objects.authenticate_user(
            request.POST['email'], request.POST['password']
        )
        if success:
            request.session['user_id'] = result.id
            return redirect('/success')
        else:
            messages.error(request, result)
    return redirect('/')

def success(request):
    if 'user_id' not in request.session:
        return redirect('/')
    user = User.objects.get(id=request.session['user_id'])
    return render(request, 'success.html', {'user': user})

def logout(request):
    request.session.flush()
    return redirect('/')
