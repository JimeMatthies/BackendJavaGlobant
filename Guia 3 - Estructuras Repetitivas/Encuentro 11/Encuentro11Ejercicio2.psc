Algoritmo Encuentro11Ejercicio2
	
	//Escribir un programa que lea un n�mero entero y devuelva el n�mero de d�gitos que
	//componen ese n�mero. Por ejemplo, si introducimos el n�mero 12345, el programa
	//deber� devolver 5. Calcular la cantidad de d�gitos matem�ticamente utilizando el operador
	//de divisi�n. Nota: recordar que las variables de tipo entero truncan los n�meros o
	//resultados.
	
	Definir num, n, digito Como Entero
	Escribir "Ingresa un numero"
	Leer num
	digito = 0
	n = num
	
	Mientras n <> 0 Hacer
		n = trunc(n/10)
		digito = digito + 1
	Fin Mientras
	
	Escribir "El numero ", num, " tiene ", digito, " digitos."
	
FinAlgoritmo
