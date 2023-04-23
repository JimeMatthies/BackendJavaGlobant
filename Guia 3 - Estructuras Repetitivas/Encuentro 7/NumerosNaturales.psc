Algoritmo NumerosNaturales
	
	//Sumatoria de los N primeros numeros enteros mayores a cero
	
	Definir num, suma, i Como Entero
	Escribir "Ingresa un numero entero"
	Leer num
	
	suma = 0
	i = 1
	
	Mientras i <= num Hacer
		suma = suma + i
		i = i + 1
	Fin Mientras
	
	Escribir "La suma de los ", num, " numeros naturales es: ", suma
	
FinAlgoritmo
