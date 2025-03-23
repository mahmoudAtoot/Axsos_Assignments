function message() {
    var element = document.querySelector(".search-input").value;
    alert(element);
}

function changeColor(el) {
    el.style.color = "#e0554b";
    el.style.backgroundColor = "white";
}
function returnColor(element) {
    element.style.color = "white";
    element.style.backgroundColor = "#e0554b";
}

function hello() {
    var myAudio = document.querySelector(".audio")
    myAudio.play()

}