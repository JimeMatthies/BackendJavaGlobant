Algoritmo Encuentro9Ejercicio5
	
	//Escribir un programa que calcule la suma de los N primeros números naturales. El valor
	//de N se leerá por teclado.
	
	Definir i, num, suma Como Entero
	
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
