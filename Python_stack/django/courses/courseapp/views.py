from django.shortcuts import render , redirect
from . import models


# Create your views here.
def index(request):
    context={
        'courses':models.Course.show_course()
        }
    return render(request, 'index.html' , context)

def add_course(request):
    if request.method =='POST':
        models.Course.add_course(request.POST)
        return redirect('/')
    return redirect('/')


def show_course_was_delete(request , id):
    context={
        'courses':models.Course.get_course_by_id(id)
        }
    return render(request, 'delete_course.html',context)

def delete_course(request, id ):
    if request.method =='POST':
        models.Course.delete_course_by_id(id)
    return redirect('/')