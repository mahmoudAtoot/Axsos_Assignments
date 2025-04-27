from django.db import models

# Create your models here.
class Course(models.Model):
    name = models.CharField(max_length=100)
    description = models.TextField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    
    
    def add_course(postdata):
        Course.objects.create(name=postdata['name'],description=postdata['description'])
    
    def show_course():
        return Course.objects.all()
    
    def get_course_by_id(id):
        return Course.objects.get(id=id)
    
    def delete_course_by_id(id):
        course= Course.objects.get(id=id)
        course.delete()
    
    