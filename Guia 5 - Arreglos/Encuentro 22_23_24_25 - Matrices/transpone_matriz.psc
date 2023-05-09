Algoritmo transpone_matriz
	
	Definir M, N, i, j Como Entero
	Definir original, transpuesta Como Real
	
	Escribir "Ingrese la cardinalidad de M y N de la matriz original"
	Leer M, N
	
	Dimension original(M,N), transpuesta(N,M)
	
	Para i = 0 Hasta M - 1 Hacer
		Para j = 0 Hasta N - 1 Hacer
			Escribir Sin Saltar "Ingrese el valor del elemento [", i, ",", j, "]"
			Leer original(i,j)
		FinPara
		
	FinPara
	
	Imprimir "Tamaño: ", (M*N), " Matriz original:"
	ImprimirMatriz(original, M, N)
	
	Para i = 0 Hasta M - 1 Hacer
		Para j = 0 Hasta N - 1 Hacer
			transpuesta(j,i) = original(i,j)
		FinPara
	FinPara
	
	Imprimir "Tamaño: ", (M*N), " Matriz transpuesta:"
	ImprimirMatriz(transpuesta, N, M)	
	
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
