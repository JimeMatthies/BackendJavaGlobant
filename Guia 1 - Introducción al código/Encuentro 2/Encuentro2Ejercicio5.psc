Algoritmo Encuentro2Ejercicio5
	
	//Escriba un programa que permita al usuario ingresar el valor de dos variables numéricas de
	//tipo entero. Posteriormente, el programa debe intercambiar los valores de ambas variables
	//y mostrar el resultado final por pantalla.
	//Por ejemplo, si el usuario ingresa los valores num1 = 9 y num2 = 3, la salida a del
	//programa deberá mostrar: num1 = 3 y num2 = 9
	//Ayuda: Para intercambiar los valores de dos variables se debe utilizar una variable auxiliar.
	
	Definir num1, num2, numAux Como Entero
	
	Escribir "Ingrese los dos numeros"
	Leer num1, num2
	
	numAux = num1
	num1 = num2
	num2 = numAux
	
	Escribir "El valor de a num1 ahora es ", num1, " y el valor de num2 ahora es ", num2
	
	
FinAlgoritmo
