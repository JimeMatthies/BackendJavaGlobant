/* Actividad Continuamos con funciones: 1 */

function calculadora(a, b, op) {
	let result;
	switch (op.toLowerCase()) {
		case "suma":
			result = a + b;
			break;
		case "resta":
			result = a - b;
			break;
		case "multiplicacion":
			result = a * b;
			break;
		case "division":
			result = a / b;
			break;
		default:
			console.log("La operación no es válida");
			break;
	}

	console.log(result);
}

calculadora(4, 6, "Suma");
calculadora(15, 5, "Resta");
calculadora(10, 1, "Multiplicacion");
calculadora(1000, 100, "Division");
