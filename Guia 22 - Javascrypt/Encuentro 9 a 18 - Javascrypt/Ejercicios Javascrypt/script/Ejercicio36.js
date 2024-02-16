/* Actividad Getters y Setters */

class Circulo {
	constructor(radio) {
		this._radio = radio;
	}

	get radio() {
		return this._radio;
	}

	set radio(nuevoRadio) {
		if (nuevoRadio > 0) {
			this._radio = nuevoRadio;
		} else {
			console.log("El radio no puede ser negativo.");
		}
	}

	get area() {
		return Math.PI * Math.pow(this._radio, 2);
	}

	get circunferencia() {
		return 2 * Math.PI * this._radio;
	}
}

const circulo1 = new Circulo(5);
console.log(circulo1);
console.log("Radio: ", circulo1.radio);
console.log("Area: " + circulo1.area.toFixed(2));
console.log("Circunferencia: " + circulo1.circunferencia.toFixed(2));
circulo1.radio = 7;
console.log("Nuevo Radio: ", circulo1.radio);
circulo1.radio = -3;
