/* Actividad Ejercicios Avanzados: 5 */

function calcularInteresCompuesto(inversionInicial, interes, tiempo) {
	let montoFinal = inversionInicial * Math.pow(1 + interes / 100, tiempo);
	console.log(montoFinal);
}

calcularInteresCompuesto(6000, 3, 2);
