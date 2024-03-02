/* Actividad Número secreto */

const codigoDescuentoSecreto = "JEAN50DCTO";
let answer = "";
let intentosCodigo = 0;
const maxIntentos = 5;

do {
	answer = prompt(
		"Adivina el codigo de descuento. Intentos: " + intentosCodigo
	);
	++intentosCodigo;
} while (codigoDescuentoSecreto != answer && intentosCodigo < maxIntentos);

if (answer == codigoDescuentoSecreto) {
	alert("¡Correcto! Solo has tardado " + intentosCodigo + " intentos.");
} else {
	alert("¡Haz fallado " + intentosCodigo + " veces. No quedan más intentos.");
}
