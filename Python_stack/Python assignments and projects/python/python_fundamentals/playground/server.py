from flask import Flask , render_template
app = Flask(__name__) 
@app.route('/play')          
def play(num_squares=4,color="blue"):
    return render_template('index.html',num_squares=num_squares,squares_color=color)
@app.route('/play/<x>')          
def play1(x,color="blue"):
    return render_template('index.html' , num_squares=int(x),squares_color=color)
@app.route('/play/<x>/<color>')          
def color(x,color = "blue"):
    return render_template('index.html', num_squares=int(x) , squares_color=color)

if __name__=="__main__":   
    app.run(debug=True,port=3000)    