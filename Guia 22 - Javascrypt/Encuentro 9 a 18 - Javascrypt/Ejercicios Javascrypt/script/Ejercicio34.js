/* Actividad Crear un objeto "Persona" */

class Persona {
	constructor(nombre, edad, ciudad, profesion) {
		this.nombre = nombre;
		this.edad = edad;
		this.ciudad = ciudad;
		this.profesion = profesion;
	}

	saludar() {
		console.log(
			`Hola, mi nombre es ${this.nombre}, tengo ${this.edad} años, vivo en ${this.ciudad} y soy ${this.cargo}.`
		);
	}
}

const persona1 = new Persona("Jimena", 36, "Santiago", "Desarrolladora");
console.log(persona1);
persona1.saludar();
