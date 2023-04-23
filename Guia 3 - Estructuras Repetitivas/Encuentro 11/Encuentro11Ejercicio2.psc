Algoritmo Encuentro11Ejercicio2
	
	//Escribir un programa que lea un número entero y devuelva el número de dígitos que
	//componen ese número. Por ejemplo, si introducimos el número 12345, el programa
	//deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
	//de división. Nota: recordar que las variables de tipo entero truncan los números o
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
