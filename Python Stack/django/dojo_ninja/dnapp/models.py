from django.db import models

class Dojo(models.Model):
    name = models.CharField(max_length=100)
    city = models.CharField(max_length=100)
    state = models.CharField(max_length=2)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

    def create_dojo(postdata):
        Dojo.objects.create(name=postdata['name'],city=postdata['city'],state=postdata['state'])

    def show_dojos():
        return Dojo.objects.all()
class Ninja(models.Model):
    first_name = models.CharField(max_length=100)
    last_name = models.CharField(max_length=100)
    dojo = models.ForeignKey(Dojo, related_name="ninjas", on_delete=models.CASCADE)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

    
    def create_ninja(data):
        dojo = Dojo.objects.get(id=data['select'])
        Ninja.objects.create(first_name=data['first_name'], last_name=data['last_name'], dojo=dojo)

    def show_ninjas():
        return Ninja.objects.all()
    
