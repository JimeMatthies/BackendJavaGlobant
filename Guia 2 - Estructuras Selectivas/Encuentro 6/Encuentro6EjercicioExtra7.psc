Algoritmo Encuentro6EjercicioExtra7
	
	//El promedio de los trabajos prácticos de un curso se calcula en base a cuatro notas de las
	//cuales se elimina la nota menor y se promedian las tres notas más altas. Escriba un
	//programa que determine cuál es la nota eliminada y el promedio de los trabajos prácticos
	//de un estudiante.
	
	Definir n1, n2, n3, n4, promedio Como Real
	Escribir "Ingrese las 4 notas de los trabajos prácticos:"
	Leer n1, n2, n3, n4
	
	Si (n1 < n2 y n1 < n3 y n1 < n4) Entonces
		Escribir "La nota menor es ", n1
		promedio = (n2 + n3 + n4)/3
	SiNo
		Si (n2 < n1 y n2 < n3 Y n2 < n4) Entonces
			Escribir "La nota menor es ", n2
			promedio = (n1 + n3 + n4)/3
		SiNo
			Si (n3 < n1 y n3 < n2 y n3 < n4) Entonces
				Escribir "La nota menor es ", n3
				promedio = (n1 + n2 + n4)/3
			SiNo
				Escribir "La nota menor es ", n4
				promedio = (n1 + n2 + n3)/3
			Fin Si
		FinSi
	FinSi
	
	Escribir "El promedio de notas es de ", promedio
	
FinAlgoritmo
