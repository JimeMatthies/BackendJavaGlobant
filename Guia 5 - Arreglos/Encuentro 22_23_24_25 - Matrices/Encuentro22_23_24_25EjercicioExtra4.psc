Algoritmo Encuentro22_23_24_25EjercicioExtra4
	
	//Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3.
	//Inicialice las matrices para evitar el ingreso de datos por teclado.
	
	Definir matriz1, matriz2 Como Entero
	Dimension matriz1(3,3), matriz2(3,3)
	
	LlenarMatriz(matriz1, 3, 3)
	LlenarMatriz(matriz2, 3, 3)
	Escribir "Matriz 1:"
	ImprimirMatriz(matriz1, 3, 3)
	Escribir ""
	Escribir "Matriz 2"
	ImprimirMatriz(matriz2, 3, 3)
	Escribir ""
	MultiplicarMatrices(matriz1, matriz2, 3, 3)
	
FinAlgoritmo

SubProceso LlenarMatriz (Matriz Por Referencia, M, N)
	Definir i, j Como Entero
	Para i = 0 Hasta M - 1 Hacer
		Para j = 0 Hasta N - 1 Hacer
			Matriz(i,j) = Aleatorio(1, 10)
		FinPara
	FinPara
FinSubProceso

SubProceso MultiplicarMatrices (Matriz1, Matriz2, M, N)
	Definir i, j, Matrizproducto Como Entero
	Dimension Matrizproducto(M, N)

	Para i = 0 Hasta M - 1 Hacer
		Para j = 0 Hasta N - 1 Hacer
			Matrizproducto(i,j) = Matriz1(i,j) * Matriz2(i,j)
		FinPara
	FinPara
	Escribir "Matriz producto:"
	ImprimirMatriz(Matrizproducto, M, N)
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