from django.shortcuts import render, redirect
import random
from datetime import datetime

def index(request):
    if 'gold' not in request.session:
        request.session['gold'] = 0
        request.session['activities'] = []
    return render(request, 'index.html')

def process_money(request):
    if request.method == 'POST':
        building = request.POST['building']
        gold_earned = 0
        if building == 'farm' or building == 'cave' or building == 'house' :
            gold_earned = random.randint(10, 20)
        elif building == 'quest':
            gold_earned = random.randint(-50, 50)  
        request.session['gold'] += gold_earned
        if 'activities' not in request.session:
            request.session['activities'] = []  

 
        time_now = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
        if gold_earned > 0:
            message = f'You entered a {building} and earned {gold_earned} gold! ({time_now})'
        else:
            message = f'You failed a {building} and lost {abs(gold_earned)} gold! ({time_now})'

        request.session['activities'].insert(0, message)

        return redirect('/')
    
def reset(request):
    request.session['gold'] = 0
    request.session['activities'] = []
    return redirect('/')