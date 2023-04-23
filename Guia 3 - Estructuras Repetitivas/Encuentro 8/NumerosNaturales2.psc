Algoritmo NumerosNaturales2
	
	//Sumatoria de los N primeros numeros enteros mayores a cero
	
	Definir num, suma, i Como Entero
	
	Repetir
		Escribir "Ingresa un numero entero"
		Leer num
	Mientras Que num <= 0
	
	suma = 0
	i = 1
	
	Mientras i <= num Hacer
		suma = suma + i
		i = i + 1
	Fin Mientras
	
	Escribir "La suma de los ", num, " numeros naturales es: ", suma
	
FinAlgoritmo