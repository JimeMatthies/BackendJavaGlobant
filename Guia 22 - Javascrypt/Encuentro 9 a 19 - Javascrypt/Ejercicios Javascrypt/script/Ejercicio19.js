/* Desafíos Complementarios: 3.- Contador de números pares e impares */

let num = parseInt(prompt("Ingrese un numero positivo"));
let par = 0;
let impar = 0;

for (let i = 0; i <= num; i++) {
	if (i % 2 == 0) {
		++par;
	} else {
		++impar;
	}
}

console.log("Existen entre 0 y " + num + ":");
console.log(par + " números pares");
console.log(impar + " números impares");
