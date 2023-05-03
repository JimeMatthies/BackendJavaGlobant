Algoritmo Encuentro18_19_20_21EjercicioExtra7
	
	//Programe una función que calcule el producto de un arreglo de números enteros. Para esto imagine,
	//por ejemplo, que para un vector V de tamaño 4, el producto de todos los valores es igual a (V[1]*V[2]*V[3]*V[4])
	
	Definir Vector, largo, i, producto Como Entero
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
	producto = ProductoArreglo(Vector, largo)
	Escribir "El producto de los elementos del vector es: ", producto
	
	
FinAlgoritmo

Funcion producto = ProductoArreglo (Vector Por Referencia, largo Por Referencia)
	Definir i, producto Como Entero
	Para i = 0 Hasta largo - 1 Hacer
		Si i = 0 Entonces
			producto = Vector(i)
		SiNo
			producto = producto * Vector(i)
		Fin Si
	Fin Para
	
FinSubProceso

