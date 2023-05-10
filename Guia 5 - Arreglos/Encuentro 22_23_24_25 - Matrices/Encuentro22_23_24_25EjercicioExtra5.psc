Algoritmo Encuentro22_23_24_25EjercicioExtra5
	
	//Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las dos
	//primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se
	//deberá almacenar el resultado de sumar el número de la primera y segunda columna. Mostrar
	//la matriz de la siguiente forma:
	//3 + 5 = 8
	//4 + 3 = 7
	//1 + 4 = 5
	
	Definir matriz, M, i, j Como Entero
	
	Escribir "Ingrese el numero de filas:"
	Leer M
	
	Dimension matriz(M, 3)
	
	Para i = 0 Hasta M - 1 Hacer
		Para j = 0 Hasta 2 Hacer
			Si j = 0 Entonces
				Escribir Sin Saltar "Ingrese el primer numero a sumar:"
				Leer matriz(i,j)
			SiNo
				Si j = 1 Entonces
					Escribir Sin Saltar "Ingrese el segundo numero a sumar:"
					Leer matriz(i,j)
				SiNo
					matriz(i,2) = matriz(i, 0) + matriz (i, 1)
				FinSi
				
			FinSi
		FinPara
	FinPara
	
	ImprimirMatriz(matriz, M, 3)
	
FinAlgoritmo

SubProceso ImprimirMatriz (Matriz, M, N)
	Definir i, j Como Entero
	Para i = 0 Hasta M - 1 Hacer
		Para j = 0 Hasta N - 1 Hacer
			Si j = 2 Entonces
				Escribir Sin Saltar Matriz(i,j)
			SiNo
				Si j = 1 Entonces
					Escribir Sin Saltar Matriz(i,j), " = "
				SiNo
					Escribir Sin Saltar Matriz(i,j), " + "
				FinSi
			FinSi
		FinPara
		Escribir ""
	FinPara
FinSubProceso