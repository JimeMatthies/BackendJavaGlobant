Algoritmo FactorialRecursion
	
	//Calcular recursivamente el factorial (!) de un número.
	//	Factorial
	//	X! = X * (X - 1) * (X - 2)... * 3 * 2 * 1
	//	1! =  0! = 1
	// 	2! = 2 * 1 = 2
	// 3! = 3 * 2 * 1 = 6
	// 4! = 4 * 3 * 2 * 1 = 24
	// 5! = 5 * 4 * 3 * 2 * 1 = 120 = 5 * (4 * 3 * 2 * 1) = 5 * 4!
	// X! = X * (X-1)!
	
	Definir num, i Como Entero
	Escribir "Ingrese un número para calcular su facotrial"
	Leer num
	Escribir Sin Saltar num, "! = "
	Para i = num Hasta 1 Hacer
		Si i = 0 Entonces
			Escribir Sin Saltar ""
		SiNo
			Si i = 1 O i = 0 Entonces
				Escribir Sin Saltar i, " = "
			SiNo
				Escribir Sin Saltar i, " * "
			Fin Si
		FinSi
	Fin Para
	Escribir Factorial(num)
	
FinAlgoritmo

Funcion f = Factorial(n)
	Definir f Como Entero
//	Definir ant Como Entero
//	Escribir "Inicia ejecución del cálculo de ", n, "!"
	Si n = 0 O n = 1 Entonces
		f = 1
//		Escribir "Condicion Base: ", n, "! = 1"
	SiNo
//		Escribir "Para conocer el ", n, "! debemos calcular el ", (n - 1), "!"
//		ant = Factorial(n - 1)
		f = n * Factorial(n - 1)
//		Escribir "Ahora sí! El ", n, "! = ", n, " * ", (n - 1), "! = ", n, " * ", ant, " = ", f
	FinSi
//	Escribir "Finaliza ejecución del cálculo de ", n, "!"
FinFuncion
	