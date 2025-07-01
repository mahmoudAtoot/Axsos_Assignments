const cars = ['Tesla', 'Mercedes', 'Honda'];

const [randomCar] = cars;
const [, otherRandomCar] = cars;

console.log(randomCar);
console.log(otherRandomCar);

const employee={
    name:'Elon',
    age:47,
    company:'tesla'
}
const{name}=employee 
const{name:othername}=employee
console.log(name);  
console.log(othername); 


const person = {
  name: 'Phil Smith',
  age: 47,
  height: '6 feet'
};

const password = '12345';

const { password: hashedPassword } = person;

console.log(password);
console.log(hashedPassword);


const numbers = [8, 2, 3, 5, 6, 1, 67, 12, 2];

const [, first] = numbers;       // first = 2
const [,,, second] = numbers;    // second = 5
const [,,,,,,,, third] = numbers; // third = 2

console.log(first == second);
console.log(first == third);

const lastTest = {
  key: 'value',
  secondKey: [1, 5, 1, 8, 3, 3]
};

const { key } = lastTest;
const { secondKey } = lastTest;
const [, willThisWork] = secondKey;

console.log(key);
console.log(secondKey);
console.log(secondKey[0]);
console.log(willThisWork);