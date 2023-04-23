Algoritmo Encuentro4Ejercicio4
	
	//Diseñe un algoritmo que lea un número de tres cifras y determine si es o no capicúa.
	
	Definir num, a, b Como Entero
	Escribir "Ingrese un numero de 3 digitos:"
	Leer num
	
	a = trunc(num/100)
	b = num % 10
	
	Si a == b Entonces
		Escribir "El numero ", num, " es capicua."
	SiNo
		Escribir "El numero ", num, " no es capicua."
	Fin Si
	
FinAlgoritmo
