Algoritmo Encuentro18_19_20_21Ejercicio3
	
	//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
	//usuario. A continuación, se debe buscar un elemento dentro del arreglo (el número a buscar
	//también debe ser ingresado por el usuario). El programa debe indicar la posición donde se
	//encuentra el valor. En caso que el número se encuentre repetido dentro del arreglo se deben
	//imprimir todas las posiciones donde se encuentra ese valor.
	//Finalmente, en caso que el número a buscar no está adentro del arreglo se debe mostrar un mensaje.
	
	Definir num, i, buscar Como Entero
	Definir encontrado Como Logico
	Dimension num(5)
	
	encontrado = Falso
	
	Para i = 0 Hasta 4 Hacer
		Escribir "Ingresa el números enteros en el indice ", i
		Leer num(i)
	Fin Para
	
	Escribir "Ingrese un numero para saber su posición dentro del arreglo:"
	
	Leer buscar
	
	Para i = 0 Hasta 4 Hacer
		Si buscar = num(i) Entonces
			Escribir "El numero ", buscar, " se encuentra en el arreglo en la poscición ", i
			encontrado = Verdadero
		Fin Si
	Fin Para
	
	Si encontrado = Falso Entonces
		Escribir "El numero ", buscar, " no se encuentra dentro del arreglo."
	Fin Si
	
FinAlgoritmo