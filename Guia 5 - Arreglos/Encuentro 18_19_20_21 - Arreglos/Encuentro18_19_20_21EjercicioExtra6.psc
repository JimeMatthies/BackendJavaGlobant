Algoritmo Encuentro18_19_20_21EjercicioExtra6
	
	//Crear una función que devuelva la diferencia que hay entre el valor más chico de un arreglo y su valor más grande.
	
	Definir Vector, largo, i Como Entero
	Escribir "Ingrese el largo del vector"
	Leer largo
	Dimension Vector(largo)
	Para i = 0 Hasta largo - 1 Hacer
		Vector(i) = Azar(100) + 1
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
	DiferenciaMAxMin(Vector, largo)
	
FinAlgoritmo

SubProceso DiferenciaMaxMin (Vector Por Referencia, largo Por Referencia)
	Definir i, max, min Como Entero
	max = Vector(0)
	min = Vector(0)
	Para i = 0 Hasta largo - 1 Hacer
		Si Vector(i) > max Entonces
			max = Vector(i)
		Fin Si
		Si Vector(i) < min Entonces
			min = Vector(i)
		FinSi
	Fin Para
	Escribir "La diferencia entre el valor mas grande (", max, ") y el valor mas pequeño (", min, ") es de ", max - min
FinSubProceso
