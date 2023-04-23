Algoritmo Encuentro7Ejercicio8
	
	//Escribir un programa que calcule cuántos dígitos tiene un número entero positivo sin
	//convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10). Nota:
	//investigar la función trunc().
	
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
