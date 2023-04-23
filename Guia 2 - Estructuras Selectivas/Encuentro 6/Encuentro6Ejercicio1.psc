Algoritmo Encuentro6Ejercicio1
	
	//Construir un programa que simule un menú de opciones para realizar las cuatro
	//operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
	//numéricos enteros. El usuario, además, debe especificar la operación con el primer
	//carácter de la operación que desea realizar: "S" o "s" para la suma, "R" o "r" para la resta,
	//"M"o "m" para la multiplicación y "D"o "d" para la división.
	
	Definir n1, n2 Como Entero
	Definir operacion Como Caracter
	Escribir "Ingrese la operación que desee realizar:"
	Escribir "S - Suma"
	Escribir "R - Resta"
	Escribir "M - Multiplicación"
	Escribir "D - División"
	Leer operacion
	Escribir "Ingrese dos numeros enteros:"
	Leer n1, n2
	
	Segun Minusculas(operacion) Hacer
		"s":
			Escribir "La suma de los dos valores es: ", n1 + n2
		"r":
			Escribir "La resta de los dos valores es: ", n1 - n2
		"m":
			Escribir "La multiplicación de los dos valores es: ", n1 * n2
		"d":
			Escribir "La división de los dos valores es: ", n1 / n2
		De Otro Modo:
			Escribir "No ha elegido una operacion válida"
	Fin Segun
	
FinAlgoritmo
