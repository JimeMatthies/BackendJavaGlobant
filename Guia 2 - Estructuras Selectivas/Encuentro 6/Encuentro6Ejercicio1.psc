Algoritmo Encuentro6Ejercicio1
	
	//Construir un programa que simule un men� de opciones para realizar las cuatro
	//operaciones aritm�ticas b�sicas (suma, resta, multiplicaci�n y divisi�n) con dos valores
	//num�ricos enteros. El usuario, adem�s, debe especificar la operaci�n con el primer
	//car�cter de la operaci�n que desea realizar: "S" o "s" para la suma, "R" o "r" para la resta,
	//"M"o "m" para la multiplicaci�n y "D"o "d" para la divisi�n.
	
	Definir n1, n2 Como Entero
	Definir operacion Como Caracter
	Escribir "Ingrese la operaci�n que desee realizar:"
	Escribir "S - Suma"
	Escribir "R - Resta"
	Escribir "M - Multiplicaci�n"
	Escribir "D - Divisi�n"
	Leer operacion
	Escribir "Ingrese dos numeros enteros:"
	Leer n1, n2
	
	Segun Minusculas(operacion) Hacer
		"s":
			Escribir "La suma de los dos valores es: ", n1 + n2
		"r":
			Escribir "La resta de los dos valores es: ", n1 - n2
		"m":
			Escribir "La multiplicaci�n de los dos valores es: ", n1 * n2
		"d":
			Escribir "La divisi�n de los dos valores es: ", n1 / n2
		De Otro Modo:
			Escribir "No ha elegido una operacion v�lida"
	Fin Segun
	
FinAlgoritmo
