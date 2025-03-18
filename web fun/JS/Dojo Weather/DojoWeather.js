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
    // var highTemps = document.querySelectorAll(".temp-high");
    // console.log(highTemps)
    var lowTemps = document.querySelectorAll(".temp-low");
    var highTemps = document.querySelectorAll(".temp-high");
    for (var i = 0; i < highTemps.length; i++) {
        if (unit == "Celsius") {
            console.log(highTemps[i].innerText);

            var max = (highTemps[i].innerText - 32) * 5 / 9;
            highTemps[i].innerText = max;
            var min = (lowTemps[i].innerText - 32) * 9 / 5
            lowTemps[i].innerText = min;

        }
        var lowTemps = document.querySelectorAll(".temp-low");
        for (var i = 0; i < lowTemps.length; i++) {
            if (unit == "Fahrenheit") {
                console.log(lowTemps[i].innerText);
                var min = (lowTemps[i].innerText * 9 / 5) + 32;
                lowTemps[i].innerText = min;
                var max = (highTemps[i].innerText * 5 / 9) +32;
                highTemps[i].innerText = max;
            }
        }

    }

}

