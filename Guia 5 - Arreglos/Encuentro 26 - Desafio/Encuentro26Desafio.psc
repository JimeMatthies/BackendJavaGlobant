Algoritmo Encuentro26Desafio
	
	//Se debe crear una matriz con las siguientes palabras como se muestra a continuaci�n. Luego de
	//eso debemos acomodar las palabras para que la primera letra ?R? de cada una quede en la posici�n 5, aline�ndose.
	//Imagen de crucigrama: 12 Columnuas, 9 filas
	//Palabras: VECTOR, MATRIX, PROGRAMA, SUBPROGRAMA, SUBPROCESO, VARIABLE, ENTERO, PARA, MIENTRAS
	
	Definir Matriz Como Caracter
	Dimension Matriz(9,12)
	
	InicializarMatriz(Matriz, 9, 12)
	ImprimirMatriz(Matriz, 9, 12)
	AgregarPalabra(Matriz, "vector", 0)
	AgregarPalabra(Matriz, "matrix", 1)
	AgregarPalabra(Matriz, "programa", 2)
	AgregarPalabra(Matriz, "subprograma", 3)
	AgregarPalabra(Matriz, "subproceso", 4)
	AgregarPalabra(Matriz, "variable", 5)
	AgregarPalabra(Matriz, "entero", 6)
	AgregarPalabra(Matriz, "para", 7)
	AgregarPalabra(Matriz, "mientras", 8)
	ImprimirMatriz(Matriz, 9, 12)
	AcomodarPalabras(Matriz)
	ImprimirMatriz(Matriz, 9, 12)
	
FinAlgoritmo

	//Subprograma InicializarMatriz:
	//Debe recibir como par�metros la matriz a inicializar, la cantidad de filas y la cantidad de columnas.
	//En primera instancia inicializaremos la matriz con un "*" (asterisco) en cada lugar 
	//para que la misma no est� vac�a y no tengamos problemas.

SubProceso InicializarMatriz (Matriz Por Referencia, M , N)
	Definir i, j Como Entero	
	Para i = 0 Hasta M - 1 Hacer
		Para j = 0 Hasta N - 1 Hacer
			Matriz(i,j) = "*"
		FinPara
	FinPara
FinSubProceso

	//Subprograma ImprimirMatriz:
	//Debe recibir como par�metros la matriz a imprimir, la cantidad de filas y la cantidad de columnas.
	//Para que veamos la matriz en la consola cuando lo necesitemos.
	//Tengamos en cuenta que para que no queden pegadas las letras vamos a imprimir un espacio, la
	//letra y otro espacio. Lo hacemos en imprimir para no modificar el contenido de la matriz.

SubProceso ImprimirMatriz (Matriz, M, N)
	Definir i, j Como Entero
	Para i = 0 Hasta M - 1
		Para j = 0 Hasta N - 1
			Escribir Sin Saltar " ", Matriz(i,j), " "
		FinPara
		Escribir ""
	FinPara
	Escribir ""
FinSubProceso

	//Subprograma agregarPalabra:
	//Se le debe indicar en los par�metros la matriz donde se va a agregar la palabra, la fila en la que se
	//agregar� y la propia palabra. Una vez el subprograma reciba eso debe descomponer la palabra y
	//agregarla a la matriz en la posici�n deseada.

SubProceso AgregarPalabra (Matriz Por Referencia, Palabra, Fila)
	Definir i Como Entero
	Para i = 0 Hasta Longitud(Palabra) - 1
		Matriz(Fila, i) = Mayusculas(Subcadena(Palabra, i, i))
	FinPara
FinSubProceso

	//Subprograma BuscarR:
	//Se le debe indicar la matriz donde se buscar� la letra R y el n�mero de fila en el que buscaremos.
	//Debe comparar cada letra de la fila indicada hasta que encuentre la primera letra ?R?. Ah� debe
	//devolvernos la posici�n de ?R?.

Funcion return = BuscarR(Matriz, Fila)
	Definir return, i Como Entero
	return = 0
	Para i = 0 Hasta 11
		Si Matriz(Fila, i) == 'R'
			return = i
			i = 11
		FinSi
	FinPara
FinSubProceso

	//Subprograma AcomodarPalabra:
	//Se le debe indicar s�lo la matriz en donde se acomodar�n las palabras.
	//Ahora debemos crear una l�gica que nos permita mover las palabras de las filas. Recordar que
	//podemos llamar a buscarR para saber cu�ntos espacios hay que mover las palabras.
	//Una vez que las palabras se muevan hay que llenar los espacios con asteriscos nuevamente: es
	//decir, si la palabra se mueve dos posiciones a la derecha hay que agregar dos asteriscos a la izquierda de la fila.

SubProceso AcomodarPalabras(Matriz)
	Definir i, j, k, pos Como Entero
	Para i = 0 Hasta 8
		pos = BuscarR(Matriz, i)
		Si pos <> 5
			Para k = 1 Hasta 5 - pos
				Para j = 11 Hasta 1
					Matriz(i,j) = Matriz(i, j - 1)
				FinPara
			FinPara
			Para k = 0 Hasta 5 - pos - 1
				Matriz(i, k) = "*"
			FinPara
		FinSi
	FinPara
FinSubProceso