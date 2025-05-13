from django.shortcuts import render, redirect , get_object_or_404
from django.contrib import messages
from .models import User, register_user, login_user
from .models import User, Project
from . import models

def index(request):
    if not 'user' in request.session:
        return render(request, 'Registration.html')
    else:
        user = request.session['user']
        return render(request, 'Dashboard.html', {'user': user})

def register(request):
    if request.method == 'POST':
        errors = User.objects.validate_register(request.POST)
        if len(errors) > 0:
            for key, value in errors.items():
                messages.error(request, value)
            return redirect('/')
        else:
            user = register_user(request.POST['first_name'], request.POST['last_name'], request.POST['email'], request.POST['password'])
            request.session['user'] = {
                'id': user.id,
                'first_name': user.first_name,
                'last_name': user.last_name,
                'email': user.email
            }
                
            return redirect('/dashboard')
    else:
        return redirect('/')


def login(request):
    if request.method == 'POST':
        success, result = User.objects.authenticate_user(request.POST['email'], request.POST['password'])
        if success:
            request.session['user_id'] = result.id
            return redirect('/dashboard')
        else:
            messages.error(request, result)
    return redirect('/')

def logout(request):
    request.session.flush()
    return redirect('/')

def dashboard(request):
    if 'user_id' not in request.session:
        return redirect('/')
    context = {
            'books': models.Project.get_all_projects(),
            'user': models.User.get_user_by_id(request.session['user']['id']),
        }
    return render(request, 'Dashboard.html', context)

def create_project(request):
    if 'user_id' not in request.session:
        return redirect('/')
    context = {'user': User.objects.get(id=request.session['user_id'])}
    return render(request, 'Create_Project.html', context)

def add_project(request):
    if request.method == 'POST':
        errors = models.Project.objects.validate_project(request.POST)
        if len(errors) > 0:
            for key, value in errors.items():
                messages.error(request, value)
            return redirect('/dashboard')
        else:
            models.Project.create_project(request.POST, request.session['user']['id'])
            return redirect('/project/project_id/details')
    else:
        return redirect('/')
    
def show_project(request, id):
    if 'user_id' not in request.session:
        return redirect('/')

    user = User.objects.get(id=request.session['user_id'])
    project = Project.objects.get(id=id)
    context = {
        'user': user,
        'project': project
    }
    return render(request, 'Project_Details.html', context)
