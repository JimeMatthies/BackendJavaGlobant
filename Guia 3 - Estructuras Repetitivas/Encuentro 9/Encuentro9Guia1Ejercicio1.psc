Algoritmo Encuentro9Guia1Ejercicio1
	
	//Escribir una estructura PARA que le solicite al usuario varios números y al finalizar muestre el
	//mayor número ingresado.
	
	Definir i, num, max Como Entero
	
	max = 0

	Para i = 1 Hasta 5 Hacer
		Escribir "Ingrese un numero"
		Leer num
		Si num > max Entonces
			max = num
		Fin Si
	Fin Para
	
	Escribir "El mayor numero ingresado es: ", max
	
FinAlgoritmo
