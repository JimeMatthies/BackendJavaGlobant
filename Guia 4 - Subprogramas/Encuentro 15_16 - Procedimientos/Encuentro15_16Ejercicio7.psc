Algoritmo Encuentro15_16Ejercicio7
	
	//Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
	//La variable A, debe terminar con el valor de la variable B.
	
	Definir altura Como Entero
	Escribir "Ingrese la altura de la escalera:"
	Leer altura
	DibujarEscalera(altura)
	
FinAlgoritmo

SubProceso DibujarEscalera(altura Por Valor)
	
	Definir i, j Como Entero
	
	Para i = 1 Hasta altura Hacer
		Para j = 1 Hasta i Hacer
			Escribir Sin Saltar j
		Fin Para
		Escribir " "
	Fin Para
	
FinSubProceso
