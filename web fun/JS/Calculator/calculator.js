var currentValue = "0";
function updateDisplay() {
document.querySelector("#display").innerText=currentValue;

}
function press(num) {
    if(document.querySelector("#display").innerText==0){
        currentValue=num;
    }else{
        currentValue+=num;

    }
    updateDisplay()

}