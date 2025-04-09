from django.shortcuts import render, redirect

def index(request):
    request.session['visits'] = request.session.get('visits', 0) + 1

    
    request.session['counter'] = request.session.get('counter', 0)
    visits = request.session.get('visits', 0)
    counter = request.session.get('counter', 0)

    data = {
    'visits': visits,
    'counter': counter
    }

    return render(request, "index.html", data)

    

def destroy_session(request):
    request.session.clear()
    return redirect('/')

def increment_by_two(request):
    request.session['counter'] = request.session.get('counter', 0) + 2
    return redirect('/')

def custom_increment(request):
    increment_value = int(request.POST.get('increment', 1))
    request.session['counter'] = request.session.get('counter', 0) + increment_value
    return redirect('/')