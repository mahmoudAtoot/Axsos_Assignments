var currentValue = "0";
function updateDisplay() {
    document.querySelector("#display").innerText = currentValue;

}
function press(num) {

    if (document.querySelector("#display").innerText == 0) {
        currentValue = num;
    } else {
        currentValue += String(num);
    }
    updateDisplay()
}

function setOP(){
    if(document.querySelector("#display").innerText !== 0){
            
    }

    

}


