from flask import Flask, render_template, request, redirect
from datetime import datetime
app = Flask(__name__)  
def ordinal(n):
    return f"{n}{'th' if 11 <= n <= 13 else {1:'st', 2:'nd', 3:'rd'}.get(n % 10, 'th')}"
@app.route('/')         
def index():
    return render_template("index.html")

@app.route('/checkout', methods=['POST'])         
def checkout():
    strawberry=request.form['strawberry']
    raspberry=request.form['raspberry']
    apple=request.form['apple']
    first_name=request.form['first_name']
    last_name=request.form['first_name']
    student_id=request.form['student_id']
    items=int(strawberry)+int(raspberry)+int(apple)
    now = datetime.now()
    day_with_suffix = ordinal(now.day)
    time_string = now.strftime("%I:%M:%S %p").lstrip("0")
    formatted_date = f"{now.strftime('%B')} {day_with_suffix} {now.year} {time_string}"
    print(f"charging {first_name+" "+last_name} for {items} fruits")

    # print(request.form)
    return render_template("checkout.html",strawberry=strawberry,raspberry=raspberry,apple=apple,first_name=first_name,last_name=last_name,student_id=student_id,items=items,time=formatted_date)

@app.route('/fruits')         
def fruits():
    return render_template("fruits.html")

if __name__=="__main__":   
    app.run(debug=True)    