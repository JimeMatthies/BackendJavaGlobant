/* Actividad Continuamos con funciones: 4 */

function factorizar(num) {
	if (num < 0) {
		return -1;
	} else if (num == 0) {
		return 1;
	} else {
		return num * factorizar(num - 1);
	}
}

console.log(factorizar(5));
