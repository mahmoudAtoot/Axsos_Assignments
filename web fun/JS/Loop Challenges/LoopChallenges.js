function oddNumbers() {
    for (var i = 1; i <= 20; i++) {
        if (i % 2 == 1) {
            console.log(i);
        }
    }
}
function multiplesOfThree() {
    for (var i = 100; i >= 0; i--) {
        if (i % 3 == 0) {
            console.log(i);
        }
    }
}
function sequence() {
    for (var i = 4; i >= -3.5; i -= 1.5) {
        console.log(i);
    }
}
function sigma() {
    var sum = 0;
    for (var i = 1; i <= 100; i++) {
        sum += i;
    }
    console.log(sum)
}
function factorial() {
    var num = 1;
    for (var i = 1; i <= 12; i++) {
        num *= i;
    }
    console.log(num)
}
oddNumbers()
multiplesOfThree()
sequence()
sigma()
factorial()

