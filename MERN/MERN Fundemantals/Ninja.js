class Ninja{
    constructor (name , health , speed =3, strength = 3) {
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.strength = strength;
    }
    sayName() {
        console.log(`My ninja name is ${this.name}`);
    }
    showStats() {
        console.log(`Name: ${this.name}, Health: ${this.health}, Speed: ${this.speed}, Strength: ${this.strength}`);
    }
    drinkSake() {
        this.health += 10;
        console.log("new health: "+this.health);
    }
 
 
}
const ninja1 = new Ninja("Mahmoud", 85);
ninja1.sayName();      
ninja1.showStats();
ninja1.drinkSake();