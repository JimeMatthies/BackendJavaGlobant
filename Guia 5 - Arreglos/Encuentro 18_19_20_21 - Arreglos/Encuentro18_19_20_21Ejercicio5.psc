Algoritmo Encuentro18_19_20_21Ejercicio5
	
	//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
	//usuario. A continuaci�n, se deber� crear una funci�n que reciba el vector y devuelva el valor
	//m�s grande del vector.
	
	Definir largo, Vector, i Como Entero
	Escribir "Ingrese el tama�o del vector:"
	Leer largo
	Dimension Vector(largo)
	Escribir "Ingrese ", largo, " n�meros:"	
	Para i = 0 Hasta largo - 1 Hacer
		Escribir i + 1, "� n�mero:"
		Leer Vector(i)
	Fin Para
	Escribir "Vector:"
	Escribir Sin Saltar "["
	Para i = 0 Hasta largo - 1 Hacer
		Si i = largo - 1 Entonces
			Escribir Sin Saltar Vector(i)
		SiNo
			Escribir Sin Saltar Vector(i), ","
		Fin Si
	Fin Para
	Escribir "]"
	BuscarMax(Vector, largo)
FinAlgoritmo

SubProceso BuscarMax (Vector Por Referencia, largo Por Referencia)
	Definir i, max Como Entero
	max = 0
	Para i = 0 Hasta largo - 1 Hacer
		Si Vector(i) > max Entonces
			max = Vector(i)
		Fin Si
	Fin Para
	Escribir "El valor mas grande del Vector es ", max
FinSubProceso
