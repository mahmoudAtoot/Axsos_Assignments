function pizzaOven(crust, sauce, cheeses, toppings) {
    return {
        crust: crust,
        sauce: sauce,
        cheeses: cheeses,
        toppings: toppings
    };
}
const pizza1 = pizzaOven("deep dish", "traditional", ["mozzarella"], ["pepperoni", "sausage"]);
const pizza2 = pizzaOven("hand tossed", "marinara", ["mozzarella", "feta"], ["mushrooms", "olives", "onions"]);
const pizza3 = pizzaOven("deep dish", "traditional", ["mozzarella"], ["pepperoni", "sausage"]);
const pizza4 = pizzaOven("hand tossed", "marinara", ["mozzarella", "feta"], ["mushrooms", "olives", "onions"]);
console.log(pizza1);
console.log(pizza2);
console.log(pizza3);
console.log(pizza4);