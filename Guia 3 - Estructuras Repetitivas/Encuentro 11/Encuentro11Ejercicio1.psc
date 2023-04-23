Algoritmo Encuentro11Ejercicio1
	
	//Realizar un programa que lea 5 números (comprendidos entre 1 y 20) e imprima el número
	//ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
	//	5 *****
	//	3 ***
	//	11 ***********
	//	2 **
	//	9 *********
	
	Definir i, j, num Como Entero
	
	Para i = 1 Hasta 5 Hacer
		Repetir
			Escribir "Ingrese un número entre 1 y 20:"
			Leer num
		Mientras Que num < 1 o num > 20
		
		Escribir Sin Saltar num, " "
		
		Para j=1 Hasta num Hacer
			Escribir Sin Saltar "*"
		Fin Para
		Escribir " "
	FinPara
	
//	Para i = 1 Hasta 5 Hacer
//		num = Aleatorio(1,20)
//		Escribir Sin Saltar num, " "
//		Para j=1 Hasta num Hacer
//			Escribir Sin Saltar "* "
//		Fin Para
//		Escribir " "
//	FinPara
	
FinAlgoritmo
