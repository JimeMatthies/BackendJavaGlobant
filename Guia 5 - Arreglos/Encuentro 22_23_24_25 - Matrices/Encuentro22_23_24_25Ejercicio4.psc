Algoritmo Encuentro22_23_24_25Ejercicio4
	
	//Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la diagonal
	//principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe generar otro
	//subproceso para imprimir la matriz.
	
	Definir M, matriz Como Entero
	
	Escribir "Ingrese el tamaño de la matriz cuadrada"
	Leer M
	
	Dimension matriz(M,M)
	
	LlenarMatrizConCeros(matriz, M)
	Escribir "Matriz:"
	ImprimirMatriz(matriz, M, M)
	
FinAlgoritmo

SubProceso LlenarMatrizconCeros (Matriz Por Referencia, M)
	Definir i, j Como Entero
	Para i = 0 Hasta M - 1 Hacer
		Para j = 0 Hasta M - 1 Hacer
			Si i = j Entonces
				Matriz(i,j) = 0
			SiNo
				Matriz(i,j) = Azar(101)
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