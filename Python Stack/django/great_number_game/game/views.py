import random
random.randint(1, 100)  
from django.shortcuts import render, redirect

def index(request):
    if 'number' not in request.session:
        request.session['number'] = random.randint(1, 100)
        request.session['message'] = ''
    return render(request, 'index.html')

def great_num(request):
    if request.method == 'POST':
        guess = int(request.POST['guess'])
        number = request.session['number']
        print(guess)

        if guess > number:
            result = "Too high!"
        elif guess < number:
            result = "Too low!"
        else:
            result = "Correct!"
            request.session.pop('number')  
            
        print(number)

        return render(request, 'index.html', {'result': result , "num":number} )

    return redirect('index')


