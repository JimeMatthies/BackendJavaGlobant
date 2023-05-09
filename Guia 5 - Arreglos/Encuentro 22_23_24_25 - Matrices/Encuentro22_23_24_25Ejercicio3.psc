Algoritmo Encuentro22_23_24_25Ejercicio3
	
	//Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar
	//un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos otro
	//subprograma que calcule y muestre la suma de los elementos de la matriz. Mostrar la matriz y
	//los resultados por pantalla.
	
	Definir M, N, matriz Como Entero
	
	Escribir "Ingrese la cardinalidad de M y N de la matriz"
	Leer M, N
	
	Dimension matriz(M,N)
	
	LlenarMatriz(matriz, M, N)
	Escribir "Matriz:"
	ImprimirMatriz(matriz, M, N)
	Escribir ""
	SumaMatriz(matriz, M, N)

FinAlgoritmo

SubProceso LlenarMatriz (Matriz Por Referencia, M, N)
	Definir i, j Como Entero
	Para i = 0 Hasta M - 1 Hacer
		Para j = 0 Hasta N - 1 Hacer
			Matriz(i,j) = Azar(101)
		FinPara
	FinPara
FinSubProceso

SubProceso SumaMatriz (Matriz, M, N)
	Definir i, j, suma Como Entero
	suma = 0
	Para i = 0 Hasta M - 1 Hacer
		Para j = 0 Hasta N - 1 Hacer
			Si j = N - 1 Entonces
				Escribir Sin Saltar Matriz(i, j)
			SiNo
				Escribir Sin Saltar Matriz(i, j), " + "
			FinSi
			suma = suma + Matriz(i,j)
		FinPara
	FinPara
	Escribir " = ", suma
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