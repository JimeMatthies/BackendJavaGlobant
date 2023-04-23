Algoritmo EncuentroCine3
	
	Definir opinion Como Entero
	Escribir "Clasifique la pelicula de 1 a 5 estrellas"
	Leer opinion
	
	Segun opinion Hacer
		1,2:
			Escribir "Nos sentimos apenados de que no hayas disfrutado la película."
		3:
			Escribir "Has clasificado la película como buena"
		4:
			Escribir "Has clasificado la película como muy buena"
		5:
			Escribir "Fantastico que hayas disfrutado de un buen entretenimiento!"
		De Otro Modo:
			Escribir "El valor ", opinion, " no es válido y no se tomará en cuenta"
	Fin Segun
	
	Escribir "Hasta la próxima!"
	
FinAlgoritmo
