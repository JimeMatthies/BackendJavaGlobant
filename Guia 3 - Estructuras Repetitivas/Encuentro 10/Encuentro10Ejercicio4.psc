Algoritmo Encuentro10Ejercicio4
	
	//La función factorial se aplica a números enteros positivos. El factorial de un número
	//entero positivo (!n) es igual al producto de los enteros positivos desde 1 hasta n:
	//n! = 1 * 2 * 3 * 4 * 5 * (n-1) * n
	//Escriba un programa que calcule las factoriales de todos los números enteros desde el 1
	//hasta el 5. El programa deberá mostrar la siguiente salida:
	// !1 = 1
	// !2 = 1*2 = 2
	// ...
	// !5 = 1*2*3*4*5 = 120
	
	Definir i, factorial Como Entero
	Definir factor Como Caracter
	
	factorial = 1
	factor = ""
	Escribir " FACTORIAL"
	Para i = 1 Hasta 5 Hacer
		factorial = factorial * i
		Si i > 1 Entonces
			factor = factor + " x " + ConvertirATexto(i)
		SiNo
			factor = factor + ConvertirATexto(i)
		Fin Si
		Si i > 1 Entonces
			Escribir i, "! = ", factor, " = ", factorial
		SiNo
			Escribir i, "! = ", factorial
		Fin Si
		
	Fin Para
	
FinAlgoritmo
