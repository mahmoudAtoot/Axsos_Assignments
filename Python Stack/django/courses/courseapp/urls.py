from django.urls import path
from . import views
urlpatterns = [ 
    path('', views.index ,name ='index'),
    path('add_course', views.add_course),
    path('courses/destroy/<int:id>', views.show_course_was_delete),
    path('confirm_delete/<int:id>', views.delete_course)

    ]
