/* Actividad Condicionales: If ternario */

let product = parseInt(prompt("¿Cual es el valor del producto?"));

let dcto = product >= 1000 ? 0.1 : 0;

let finalPrice = product - product * dcto;

console.log("Precio final: " + finalPrice);
