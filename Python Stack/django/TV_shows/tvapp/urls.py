from django.urls import path
from . import views

urlpatterns = [            
    path('', views.index ,name ='index'),
    path('shows/new', views.show),
    path('add_show' , views.add_show),
    path('shows', views.show_all),
    path('shows/<int:id>', views.show_one),
    path('shows/<int:id>/edit',views.edit_show),
    path('shows/<int:id>/update',views.update),
    path('shows/<int:id>/destroy',views.delete_show),
         
    ]
