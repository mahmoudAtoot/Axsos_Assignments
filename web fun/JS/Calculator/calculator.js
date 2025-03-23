
var display = document.querySelector("#display")
var equals = document.querySelector("#equals")
var op
var calculation;
function press(num) {

    if (display.innerText == 0) {
        display.innerText = num;
    } else {
        display.innerText += num;
    }
}

function setOP(operator) {
    calculation = display.innerText;
    display.innerText = 0;
    op = operator;

}
function clr() {
    display.innerText = 0;
    op = ""
    calculation = 0

}
function calculate(){
    

}


















