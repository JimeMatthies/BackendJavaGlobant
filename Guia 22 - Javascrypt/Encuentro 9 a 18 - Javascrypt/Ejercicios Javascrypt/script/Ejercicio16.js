/* Actividad Estructuras Repetitivas: Do While */

let sum = 0;
let num = 0;

do {
	sum += num;
	num = parseInt(prompt("Ingrese numeros positivos para sumar"));
} while (num > 0);

console.log(sum);
