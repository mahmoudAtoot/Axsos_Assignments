// // GIVEN
// // console.log(example); 
// // var example ="I'm the example!";
// // AFTERHOISTINGBYTHEINTERPRETER
// // var example;
// // console.log(example); // logs undefined
// // example = "I'm the example!";

  // console.log(example);
// let example = "i am the example";

// This creates a Temporal Dead Zone (TDZ) — 
// a period from the start of the block until the variable is declared, where accessing the variable throws an error.
// >>
// let example ;not initialized**
// console.log(example);
// example = "i am the example"
// outbut is >> ReferenceError

// Hoisted:
// let example; // (declared but uninitialized — in the TDZ)
// console.log(example); //  Error: example is in TDZ
// example = "i am the example"; // assignment (never reached)


                                          // Num 1
// console.log(hello);                                 
// var hello ='world';

// var hello:Hoisted         // declaration hoisted
// console.log(hello);       //  it's undefined at this point
// outbut is undefined       // assignment happens here


                                          // Num 2
// global variable
// var needle ='haystack';
// test();
// function test()
// {
//     // local scope variable
//     var needle ='magnet';
//     console.log(needle);    // outbut is magnet
// }


                                          // Num 3

//global variable                                 
// var brendan ='super cool';
// function print()
// {
//     brendan ='only okay';    //this affects the global variable
//     console.log(brendan);
 
// }
// console.log(brendan);       // outbut super cool because the function is never called 



                                            // Num 4

//global variable                                                 
// var food ='chicken';
//  console.log(food);             //print chicken
//  eat();                         //call the function
//  function eat()
//  {
//     food ='half-chicken';
//     console.log(food);          // prints 'half-chicken'
//     var food ='gone';           //declare after the print so it hosted and dont afect the result
// }
// outbut is chicken then half chicken s


                                                // Num 5

                                               
// mean();                             //calling the function before it's defined
//  console.log(food);
//  var mean=function(){               //function expression, not a function declaration.
//     food ="chicken";                //Only the var mean declaration is hoisted — not the function body.
//     console.log(food);
//     var food ="fish";
//     console.log(food);
// }
// consolee.log(food);
//this is gona make error because the function is call befor it declare and canote sit var for it


                                                 // Num 6
// console.log(genre);      // genre="disco" it is undefined;
//  var genre ="disco";
//  rewind();
//  function rewind()
//  {
//     genre ="rock";
//     console.log(genre);     // print rock 
//     var genre ="r&b";
//     console.log(genre);     // print r&b 

//  }
//  console.log(genre);        // print disco


                                                     // Num 7
// dojo ="san jose";
// console.log(dojo);  // print san jose
// learn();            //call the function 
// function learn()    // declare the function
// {                   // local vareable
//     dojo ="seattle";
//     console.log(dojo);      //print  seattle
//     var dojo ="burbank";
//     console.log(dojo);      // then  print burbank 
// } 
// console.log(dojo);          //then   print san jose 

                                                     // Num 8
// console.log(makeDojo("Chicago",65)); 
// console.log(makeDojo("Berkeley",0));
// function makeDojo(name, students)
// {
//     const dojo ={}; // you can changed its properties but you can't reassign the whole variable to a new value 
//     dojo.name= name;
//     dojo.students= students;
//     if(dojo.students>50){
//         dojo.hiring=true;
//     }
//     else if(dojo.students<=0){
//         dojo ="closed for now";
//     }
//     return dojo;  // output is true the false
// }


