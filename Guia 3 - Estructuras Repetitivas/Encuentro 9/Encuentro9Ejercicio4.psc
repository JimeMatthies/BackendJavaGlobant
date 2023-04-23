Algoritmo Encuentro9Ejercicio4
	
	//Realizar un programa que muestre la cantidad de números que son múltiplos de 2 o de 3
	//comprendidos entre 1 y 100.
	
	Definir i, suma Como Entero
	
	suma = 0
	
	Para i = 1 Hasta 100 Hacer
		Si i MOD 2 = 0 o i MOD 3 = 0 Entonces
			suma = suma + 1
		Fin Si
	Fin Para
	
	Escribir "La cantidad de numeros que son divisibles entre 2 y 3 son: ", suma
	
FinAlgoritmo
