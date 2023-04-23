Algoritmo Encuentro10Ejercicio3
	
	//Escriba un programa que lea un número entero (altura) y a partir de él cree una escalera
	//invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se
	//deberá mostrar:
	//	*****
	//	****
	//	***
	//	**
	//  *
	
	Definir n, i, j Como Entero
	
	Repetir
		Escribir "Ingrese un número entero:"
		Leer n
	Mientras Que n <= 0
	
	Para i = n Hasta 1 Hacer
		Para j = i Hasta 1 Hacer
			Escribir Sin Saltar" *"
		Fin Para
		Escribir " "
	Fin Para
	
	Escribir " "
	
FinAlgoritmo
