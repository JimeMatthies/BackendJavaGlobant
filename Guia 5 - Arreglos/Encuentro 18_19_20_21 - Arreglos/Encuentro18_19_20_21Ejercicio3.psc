Algoritmo Encuentro18_19_20_21Ejercicio3
	
	//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
	//usuario. A continuaci�n, se debe buscar un elemento dentro del arreglo (el n�mero a buscar
	//tambi�n debe ser ingresado por el usuario). El programa debe indicar la posici�n donde se
	//encuentra el valor. En caso que el n�mero se encuentre repetido dentro del arreglo se deben
	//imprimir todas las posiciones donde se encuentra ese valor.
	//Finalmente, en caso que el n�mero a buscar no est� adentro del arreglo se debe mostrar un mensaje.
	
	Definir num, i, buscar Como Entero
	Definir encontrado Como Logico
	Dimension num(5)
	
	encontrado = Falso
	
	Para i = 0 Hasta 4 Hacer
		Escribir "Ingresa el n�meros enteros en el indice ", i
		Leer num(i)
	Fin Para
	
	Escribir "Ingrese un numero para saber su posici�n dentro del arreglo:"
	
	Leer buscar
	
	Para i = 0 Hasta 4 Hacer
		Si buscar = num(i) Entonces
			Escribir "El numero ", buscar, " se encuentra en el arreglo en la poscici�n ", i
			encontrado = Verdadero
		Fin Si
	Fin Para
	
	Si encontrado = Falso Entonces
		Escribir "El numero ", buscar, " no se encuentra dentro del arreglo."
	Fin Si
	
FinAlgoritmo