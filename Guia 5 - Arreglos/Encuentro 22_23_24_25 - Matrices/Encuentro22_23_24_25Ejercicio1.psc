Algoritmo Encuentro22_23_24_25Ejercicio1
	
	//Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el usuario y los muestre por pantalla.
	
	Definir i, j Como Entero
	Definir matriz Como Real

	Dimension matriz(3,3)
	
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			Escribir Sin Saltar "Ingrese el valor del elemento [", i, ",", j, "]"
			Leer matriz(i,j)
		FinPara
	FinPara
	
	Escribir "Matriz 3x3:"
	ImprimirMatriz(matriz, 3, 3)

FinAlgoritmo

SubProceso ImprimirMatriz (Matriz, M, N)
	Definir i, j Como Entero
	Para i = 0 Hasta M - 1 Hacer
		Escribir Sin Saltar "["
		Para j = 0 Hasta N - 1 Hacer
			Si j = N - 1 Entonces
				Escribir Sin Saltar Matriz(i,j)
			SiNo
				Escribir Sin Saltar Matriz(i,j), ","
			FinSi
		FinPara
		Escribir "]"
	FinPara
FinSubProceso