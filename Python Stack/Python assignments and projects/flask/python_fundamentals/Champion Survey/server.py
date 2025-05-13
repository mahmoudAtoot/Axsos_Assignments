from flask import Flask, render_template, request, redirect  # added render_template!
app = Flask(__name__)                     
@app.route('/') 
def hello_world(): 
    return render_template('index.html')  

@app.route('/result', methods=['POST'])                           
def res():
    name=request.form['user_name']
    location=request.form['location']
    progLang=request.form['prog-lang']
    comment=request.form['comment']
    return render_template('result.html',name=name,location=location,progLang=progLang,comment=comment)  

if __name__=="__main__":
    app.run(debug=True , port=3000)       