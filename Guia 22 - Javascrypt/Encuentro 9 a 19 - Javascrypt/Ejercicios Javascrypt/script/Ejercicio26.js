/* Actividad Ejercicios Avanzados: 1 */

function esPrimo(num) {
	if (num <= 1) {
		return false;
	}

	for (let i = 2; i < num; i++) {
		if (num % i === 0) {
			return false;
		} else {
			return true;
		}
	}
}

console.log(esPrimo(1));
console.log(esPrimo(7));
console.log(esPrimo(10));
console.log(esPrimo(13));
console.log(esPrimo(6));
