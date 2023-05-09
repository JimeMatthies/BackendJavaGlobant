Algoritmo Encuentro22_23_24_25Ejercicio2
	
	//Escribir un programa que realice la búsqueda lineal de un número entero ingresado por el
	//usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las
	//coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra. En
	//caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.
	
	Definir i, j, buscar, matriz Como Entero
	Definir encontrado Como Logico
	encontrado = Falso
	
	Escribir "Ingrese el numero que desea buscar en la matriz"
	Leer buscar
	
	Dimension matriz(5,5)
	
	Para i = 0 Hasta 4 Hacer
		Para j = 0 Hasta 4 Hacer
			matriz(i,j) = Azar(101)
		FinPara
	FinPara
	
	Para i = 0 Hasta 4 Hacer
		Para j = 0 Hasta 4 Hacer
			Si buscar = matriz(i,j) Entonces
				Escribir "El número ", buscar, " ha sido encontrado en la posicion [", i, ",", j ,"]"
				encontrado = Verdadero
			Fin Si
		FinPara
	FinPara
	
	Si encontrado = Falso Entonces
		Escribir "El número no se encuentra dentro de la matriz"
	Fin Si
	
	Escribir "Matriz 5x5:"
	ImprimirMatriz(matriz, 5,5)
	
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