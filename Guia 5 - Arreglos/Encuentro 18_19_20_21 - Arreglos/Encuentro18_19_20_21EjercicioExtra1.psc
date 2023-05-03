Algoritmo Encuentro18_19_20_21EjercicioExtra1
	
	//Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios y los
	//muestre por pantalla.
	
	Definir i, VectorA, VectorB Como Entero
	Dimension VectorA(5), VectorB(5)
	
	Para i = 0 Hasta 4 Hacer
		VectorA(i) = Azar(100) + 1
		VectorB(i) = Azar(100) + 1
	Fin Para
	Escribir "Vector A:"
	Escribir Sin Saltar "["
	Para i = 0 Hasta 4 Hacer
		Si i = 4 Entonces
			Escribir Sin Saltar VectorA(i)
		SiNo
			Escribir Sin Saltar VectorA(i), ","
		Fin Si
	Fin Para
	Escribir "]"
	Escribir "Se ha llenado el vector A correctamente."
	
	Escribir "Vector B:"
	Escribir Sin Saltar "["
	Para i = 0 Hasta 4 Hacer
		Si i = 4 Entonces
			Escribir Sin Saltar VectorB(i)
		SiNo
			Escribir Sin Saltar VectorB(i), ","
		Fin Si
	Fin Para
	Escribir "]"
	Escribir "Se ha llenado el vector B correctamente."
	
FinAlgoritmo
