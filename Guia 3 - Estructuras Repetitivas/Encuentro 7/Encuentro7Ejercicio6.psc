Algoritmo Encuentro7Ejercicio6
	
	//Escriba un programa que solicite al usuario n�meros decimales mientras que el usuario
	//escriba n�meros mayores al primero que se ingres�. Por ejemplo: si el usuario ingresa
	//como primer n�mero un 3.1, y luego ingresa un 4, el programa debe solicitar un tercer
	//n�mero. El programa continuar� solicitando valores sucesivamente mientras los valores
	//ingresados sean mayores que 3.1, caso contrario, el programa finaliza.
	
	Definir num, limite Como Real
	Escribir "Ingrese un numero decimal"
	Leer limite
	Escribir "Ingrese un numero decimal"
	Leer num
	
	Mientras num > limite Hacer
		Escribir "Ingrese un numero decimal"
		Leer num
	Fin Mientras
	
FinAlgoritmo
