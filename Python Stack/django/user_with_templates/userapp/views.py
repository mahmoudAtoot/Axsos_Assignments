from django.shortcuts import render, redirect
from .models import User

def index(request):
    if request.method == "POST":
        data = request.POST
        if not User.objects.filter(email=data['email']).exists():
            User.objects.create(
                firstname=data['firstname'],
                lastname=data['lastname'],
                email=data['email'],
                age=data['age']
            )
        return redirect('index')

    return render(request, 'index.html', {
        'users': User.objects.all()
    })
