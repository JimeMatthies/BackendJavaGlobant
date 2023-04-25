Algoritmo Encuentro15_16Ejercicio1
	
	//Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
	//La variable A, debe terminar con el valor de la variable B.
	
	Definir a, b Como Entero
	Escribir "Ingrese el valor de A:"
	Leer a
	Escribir "Ingrese el valor de B:"
	Leer b
	IntercambiarValor(a,b)
	Escribir "El valor de A ahora es: ", a
	Escribir "El valor de B ahora es: ", b
	
	
FinAlgoritmo

SubProceso IntercambiarValor(a Por Referencia, b Por Referencia)
	Definir c Como Entero
	c = a
	a = b
	b = c
FinSubProceso
	