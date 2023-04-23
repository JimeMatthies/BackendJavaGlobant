Algoritmo Encuentro7Ejercicio7
	
	//Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se
	//calcula según el siguiente criterio: la parte práctica vale el 10%; la parte de problemas
	//vale el 50% y la parte teórica el 40%. El programa leerá el nombre del alumno, las tres
	//notas obtenidas, mostrará el resultado por pantalla, y a continuación volverá a pedir los
	//datos del siguiente alumno hasta que el nombre sea una cadena vacía. Las notas deben
	//estar comprendidas entre 0 y 10, y si no están dentro de ese rango no se imprimirá el
	//promedio y se mostrará un mensaje de error.
	
	Definir nombre Como Caracter
	Definir practica, problemas, teorica, final, promedio, suma, alumnos Como Real
	Escribir "Ingresar nombre del alumno"
	Leer nombre
	suma = 0
	alumnos = 0

	Mientras Longitud(nombre) > 0 Hacer
		Escribir "Ingrese nota de practica"
		Leer practica
		Mientras practica < 0 o practica > 10 Hacer
			Escribir "La nota ingresada no es válida. Ingrese nota de practica"
			Leer practica
		Fin Mientras
		Escribir "Ingrese nota de problemas"
		Leer problemas
		Mientras problemas < 0 o problemas > 10 Hacer
			Escribir "La nota ingresada no es válida. Ingrese nota de problemas"
			Leer problemas
		Fin Mientras
		Escribir "Ingrese nota de teoría"
		Leer teorica
		Mientras teorica < 0 o teorica > 10 Hacer
			Escribir "La nota ingresada no es válida. Ingrese nota de teoría"
			Leer teorica
		Fin Mientras
		final = (practica*0.1) + (problemas*0.5) + (teorica*0.4)
		Escribir "La nota final del alumno es ", final
		suma = suma + final
		alumnos = alumnos + 1
		Escribir "Ingresar nombre del alumno"
		Leer nombre
	Fin Mientras
	
	Escribir "No hay mas alumnos"
	
	Si suma = 0 Entonces
		alumnos = 1
	Fin Si
	promedio = suma / alumnos
	
	Escribir "En el curso con ", alumnos, " alumnos, tiene un promedio de notas de ", promedio
	
FinAlgoritmo
