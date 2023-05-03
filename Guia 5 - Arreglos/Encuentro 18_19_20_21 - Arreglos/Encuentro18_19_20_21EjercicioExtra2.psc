Algoritmo Encuentro18_19_20_21EjercicioExtra2
	
	//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
	//usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados.
	
	Definir largo, Vector, i, suma Como Entero
	suma = 0
	Escribir "Ingrese el tamaño del vector:"
	Leer largo
	Dimension Vector(largo)
	Escribir "Ingresa ", largo, " números:"
	Para i = 0 Hasta largo - 1 Hacer
		Leer Vector(i)
		suma = suma + Vector(i)
	Fin Para
	
	Escribir "El promedio de los números ingresados es:"
	Escribir suma / largo
	
FinAlgoritmo
