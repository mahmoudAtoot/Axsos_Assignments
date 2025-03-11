function showCity1() {
    alert('Burbank: Weather');
}
function showCity2() {
    alert('Chicago: Weather');
}
function showCity3() {
    alert('Dalla: Weather');
}

function dismissMessage() {
    var x = document.querySelector(".info")
    x.remove()
}

function convertTemperature() {
    var unit = document.getElementById("temp").value;
    var highTemps = document.querySelectorAll(".temp-high");
    var lowTemps = document.querySelectorAll(".temp-low");

    highTemps.forEach(temp => {
        var currentTemp = parseInt(temp.textContent); 
        if (unit === "f") {
            temp.textContent = Math.round((currentTemp * 9/5) + 32) + "°";
        } else {
            temp.textContent = Math.round((currentTemp - 32) * 5/9) + "°";
        }
    });

    lowTemps.forEach(temp => {
        var currentTemp = parseInt(temp.textContent);
        if (unit === "f") {
            temp.textContent = Math.round((currentTemp * 9/5) + 32) + "°";
        } else {
            temp.textContent = Math.round((currentTemp - 32) * 5/9) + "°";
        }
    });
}

