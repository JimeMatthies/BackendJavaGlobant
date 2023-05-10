Algoritmo Encuentro22_23_24_25EjercicioExtra2
	
	//Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario), llenarla
	//con números aleatorios entre 1 y 100 y mostrar su traspuesta.
	//La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
	
	Definir M, N, matriz Como Entero
	
	Escribir "Ingrese la cardinalidad de M y N de la matriz"
	Leer M, N
	
	Dimension matriz(M,N)
	
	LlenarMatriz(matriz, M, N)
	Escribir "Matriz:"
	ImprimirMatriz(matriz, M, N)
	Escribir ""
	TransponerMatriz(matriz, M, N)
	
FinAlgoritmo

SubProceso TransponerMatriz (Matriz, M, N)
	Definir transpuesta, i, j Como Entero
	Dimension transpuesta(N,M)
	
	Para i = 0 Hasta M - 1 Hacer
		Para j = 0 Hasta N - 1 Hacer
			transpuesta(j,i) = Matriz(i,j)
		FinPara
	FinPara
	
	Escribir "Transpuesta"
	ImprimirMatriz(transpuesta, N, M)
	
FinSubProceso

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