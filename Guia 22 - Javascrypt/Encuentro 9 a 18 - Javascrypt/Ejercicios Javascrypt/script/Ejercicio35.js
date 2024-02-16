/* Actividad Crear un objeto "Libro" */

class Libro {
	constructor(titulo, autor, añoPublicacion, genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.añoPublicacion = añoPublicacion;
		this.genero = genero;
	}

	informacion() {
		console.log(
			`Título: ${this.titulo}, Autor: ${this.autor}, Año de Publicación: ${this.añoPublicacion}, Genero: ${this.genero}`
		);
	}
}

const libro1 = new Libro(
	"Someday, Someday, Maybe: A Novel.",
	"Lauren Graham",
	2013,
	"Humor"
);
console.log(libro1);
libro1.informacion();
