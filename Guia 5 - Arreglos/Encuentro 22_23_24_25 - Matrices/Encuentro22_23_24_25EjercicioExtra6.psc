Algoritmo Encuentro22_23_24_25EjercicioExtra6
	
	//Realizar un programa que permita visualizar el resultado del producto de una matriz de
	//enteros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden
	//inicializarse evitando así el ingreso de datos por teclado. Para conocer más acerca de cómo se
	//realiza la multiplicación entre matrices consultar el siguiente link:
	
	Definir matriz, matrizproducto, vector, i, j Como Entero
	Dimension matriz(3,3), matrizproducto(3,3), vector(3)
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			Matriz(i,j) = Aleatorio(1, 10)
		FinPara
		Vector(i) = Aleatorio(1,10)
	FinPara
	Escribir "Matriz:"
	ImprimirMatriz(matriz, 3, 3)
	Escribir ""
	Escribir "Vector:"
	Escribir Sin Saltar "["
	Para i = 0 Hasta 2 Hacer
		Si i = 2 Entonces
			Escribir Sin Saltar vector(i)
		SiNo
			Escribir Sin Saltar vector(i), ","
		FinSi
	FinPara
	Escribir "]"
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			matrizproducto(j, i) = matriz(j,i) * vector(i)
		FinPara
	FinPara
	Escribir ""
	Escribir "Producto:"
	ImprimirMatriz(matrizproducto, 3, 3)
	
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