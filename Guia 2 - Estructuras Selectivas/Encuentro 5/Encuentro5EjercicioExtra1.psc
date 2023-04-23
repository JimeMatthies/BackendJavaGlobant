Algoritmo Encuentro5EjercicioExtra1
	
	//Realizar un programa que pida tres notas y determine si un alumno aprueba o reprueba
	//un curso, sabiendo que aprobará el curso si su promedio de tres calificaciones es mayor o
	//igual a 70; y reprueba en caso contrario.
	
	Definir nota1, nota2, nota3, promedio Como Real
	Escribir "Ingreas tus tres notas:"
	Leer nota1, nota2, nota3
	
	promedio = (nota1 + nota2 + nota3) / 3
	
	Si promedio >= 70 Entonces
		Escribir "Felicidades, aprobaste el curso. Tu promedio es de ", trunc(promedio)
	SiNo
		Escribir "Lamentablemente tu promedio es de ", trunc(promedio), " Deberas estudiar más para la próxima!"
	FinSi
	
FinAlgoritmo
