Algoritmo Encuentro3EjercicioExtra11
	
	//Un alumno desea saber cu�l ser� su calificaci�n final en la materia de Algoritmos. Dicha
	//calificaci�n se compone de los siguientes porcentajes:
		//a. 55% del promedio de sus tres calificaciones parciales.
		//b. 30% de la calificaci�n del examen final.
		//c. 15% de la calificaci�n de un trabajo final.
	
	Definir notaParcial1, notaParcial2, notaParcial3, examenFinal, trabajoFinal, notaFinal Como Real
	
	Escribir "Ingresa tus notas parciales:"
	Leer notaParcial1, notaParcial2, notaParcial3
	Escribir "Ingresa la nota de tu examen final"
	Leer examenFinal
	Escribir "Ingresa la nota de tu trabajo final"
	Leer trabajoFinal
	
	notaFinal = (0.55 * ((notaParcial1 + notaParcial2 + notaParcial3)/3)) + (0.3 * examenFinal) + (0.15 * trabajoFinal)
	
	Escribir "Tu calificacion final es ", notaFinal
	
FinAlgoritmo
