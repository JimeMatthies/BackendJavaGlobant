Algoritmo Encuentro18_19_20_21Ejercicio2
	
	//Realizar un programa que lea 10 n�meros reales por teclado, los almacene en un arreglo y
	//muestre por pantalla la suma, resta y multiplicaci�n de todos los n�meros ingresados al
	//arreglo.
	
	Definir num, suma, resta, multiplicacion Como Real
	Definir i Como Entero
	Dimension num(10)
	
	Escribir "Ingresa 10 n�meros:"
	
	Para i = 0 Hasta 9 Hacer
		Leer num(i)
	Fin Para
	
	Escribir "Los suma de los n�meros ingresados es:"
	
	suma = 0
	
	Para i = 0 Hasta 9 Hacer
		Si i = 9 Entonces
			Escribir Sin Saltar num(i), " = "
		SiNo
			Escribir Sin Saltar num(i), " + "
		Fin Si
		
		suma = suma + num(i)
		
	Fin Para
	
	Escribir suma
	
	Escribir "La resta de los n�meros ingresados es:"
	
	resta = 0
	
	Para i = 0 Hasta 9 Hacer
		
		Si i = 0 Entonces
			resta = num(i)
		SiNo
			resta = resta - num(i)
		Fin Si
		
		Si i = 9 Entonces
			Escribir Sin Saltar num(i), " = "
		SiNo
			Escribir Sin Saltar num(i), " - "
		Fin Si
		
	Fin Para
	
	Escribir resta
	
	Escribir "La multiplicaci�n de los n�meros ingresados es:"
	
	multiplicacion = 0
	
	Para i = 0 Hasta 9 Hacer
		
		Si i = 0 Entonces
			multiplicacion = num(i)
		SiNo
			multiplicacion = multiplicacion * num(i)
		Fin Si
		
		Si i = 9 Entonces
			Escribir Sin Saltar num(i), " = "
		SiNo
			Escribir Sin Saltar num(i), " - "
		Fin Si
		
	Fin Para
	
	Escribir multiplicacion
	
FinAlgoritmo