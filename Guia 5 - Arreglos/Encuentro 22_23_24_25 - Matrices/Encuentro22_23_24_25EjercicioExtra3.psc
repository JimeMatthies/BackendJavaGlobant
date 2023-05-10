Algoritmo Encuentro22_23_24_25EjercicioExtra3
	
	//Realizar un programa que cree una matriz de 5x15 y deberemos llenar la matriz de unos y
	//ceros. Llenando el marco o la delimitación externa de la matriz de unos y la parte interna de ceros.
	
	Definir matriz, M, N Como Entero
	
	M = 5
	N = 15
	
	Dimension matriz(M,N)
	
	MatrizConMarcoCeros(matriz, M, N)
	Escribir "Matriz:"
	ImprimirMatriz(matriz, M, N)
	
FinAlgoritmo

SubProceso MatrizConMarcoCeros (Matriz Por Referencia, M, N)
	Definir i, j Como Entero
	Para i = 0 Hasta M - 1 Hacer
		Para j = 0 Hasta N - 1 Hacer
			Si i = 0 o i = M - 1 o j = 0 o j = N - 1 Entonces
				Matriz(i,j) = 1
			SiNo
				Matriz(i,j) = 0
			Fin Si
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