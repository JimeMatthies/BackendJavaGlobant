Algoritmo NumerosNaturales3
	
	//Sumatoria de los N primeros numeros enteros mayores a cero
	
	Definir num, suma, i Como Entero
	
	Repetir
		Escribir "Ingresa un numero entero"
		Leer num
	Mientras Que num <= 0
	
	suma = 0
	
	Para i = 1 Hasta num Hacer
		suma = suma + i
	Fin Para
	
	Escribir "La suma de los ", num, " numeros naturales es: ", suma
	
FinAlgoritmo