from django.shortcuts import render,redirect
from . import models
# Create your views here.
def index(request):
    context={
        'dojos':models.Dojo.show_dojos(),
        'ninjas':models.Ninja.show_ninjas()
    }
    return render(request,'index.html',context)

def add_user(request):
    if request.method =='POST':
        models.Dojo.create_dojo(request.POST)
        return redirect('/')
    return redirect('/')

def create_ninja(request):
    if request.method == "POST":
        models.Ninja.create_ninja(request.POST)
    return redirect('/')