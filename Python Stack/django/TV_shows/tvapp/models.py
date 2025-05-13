from django.db import models

# Create your models here.

class ShowManager(models.Manager):
    def basic_validator(self, postData):
        errors = {}
       
        if len(postData['title']) < 3:
            errors["title"] = "title should be at least 2 characters"
        if len(postData['network']) < 3:
            errors["network"] = "network should be at least 3 characters"
        if len(postData['description']) < 10:
            errors["description"] = "description should be at least 10 characters"

        return errors

class Show(models.Model):
    title = models.CharField(max_length=100)
    network = models.CharField(max_length=100)
    release_date = models.DateField()
    description = models.TextField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = ShowManager()
    

    
    def add_show(data):
      return  Show.objects.create(title=data['title'], network=data['network'], release_date=data['date'], description=data['description'])
        
    def show_all():
        return Show.objects.all()

    def get_show_by_id(id):
        return Show.objects.get(id=id)
    
    def update_show(new_info,id):
        show = Show.objects.get(id=id)
        show.title=new_info['title']
        show.network=new_info['network']
        show.release_date=new_info['date']
        show.description=new_info['description']
        show.save()
    
    def delet_show_by_id(id):
        del_show= Show.objects.get(id=id)
        del_show.delete()
    
