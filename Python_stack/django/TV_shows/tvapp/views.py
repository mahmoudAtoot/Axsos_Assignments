from django.shortcuts import render , redirect
from . import models
from django.contrib import messages
from .models import Show


# Create your views here.
def index(request):
    return render(request, 'index.html')

def show(request):
    return render(request, 'add_show.html')

def all_shows(request):
    return render(request, 'All_Shows.html')

def add_show(request):
    if request.method =='POST':
        errors = models.Show.objects.basic_validator(request.POST)
        if len(errors) > 0:
            for key, value in errors.items():
                messages.error(request, value)
            return redirect('/shows/new')
        else:
            id=models.Show.add_show(request.POST)
        return redirect(f'/shows/{id.id}')
    else:
        return redirect('/shows/new')

def show_all(request):
    context={ 
        'shows' :models.Show.show_all(), 
    }
    return render(request,'All_Shows.html',context)

def show_one(request , id):
    context={ 
        'show' :models.Show.get_show_by_id(id), 
    }
    return render(request,'show_one.html',context)

def edit_show(request , id):
    context={ 
        'show' :models.Show.get_show_by_id(id), 
    }
    return render(request, 'update.html' , context)

def delete_show(request , id):
    models.Show.delet_show_by_id(id), 
    return redirect('/shows')

def edit_show(request,id):
      context={
            'show':models.Show.get_show_by_id(id)
      }        
      return render(request,'update.html',context)

def update(request,id):
      if request.method == 'POST':
            errors = models.Show.objects.basic_validator(request.POST)
            if len(errors) > 0:
                  for key, value in errors.items():
                        messages.error(request, value)
                  return redirect(f'/shows/{id}/edit')
            else:
                  models.Show.update_show(request.POST,id)
                  return redirect('/')
    