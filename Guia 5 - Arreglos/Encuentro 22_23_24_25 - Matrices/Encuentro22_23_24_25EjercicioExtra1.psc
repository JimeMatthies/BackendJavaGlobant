Algoritmo Encuentro22_23_24_25EjercicioExtra1
	
	//Realizar un programa que rellene de números aleatorios una matriz a través de un
	//subprograma y generar otro subprograma que muestre por pantalla la matriz final.
	
	Definir M, N, matriz Como Entero
	
	Escribir "Ingrese la cardinalidad de M y N de la matriz"
	Leer M, N
	
	Dimension matriz(M,N)
	
	LlenarMatriz(matriz, M, N)
	Escribir "Matriz:"
	ImprimirMatriz(matriz, M, N)

FinAlgoritmo

SubProceso LlenarMatriz (Matriz Por Referencia, M, N)
	Definir i, j Como Entero
	Para i = 0 Hasta M - 1 Hacer
		Para j = 0 Hasta N - 1 Hacer
			Matriz(i,j) = Azar(101)
		FinPara
	FinPara
FinSubProceso

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