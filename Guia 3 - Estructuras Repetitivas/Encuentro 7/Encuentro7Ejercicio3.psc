Algoritmo Encuentro7Ejercicio3
	
	//Dada una secuencia de n�meros ingresados por teclado que finaliza con un -1, por
	//ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,......,-1; realizar un programa que calcule el promedio de
	//los n�meros ingresados. Suponemos que el usuario no insertar� n�mero negativos.
	
	Definir num, suma, i Como Entero
	Definir promedio Como Real
	Escribir "Ingrese un numero entero"
	Leer num
	
	suma = 0
	i = 1
	suma = suma + num
	
	Mientras num >= 0 Hacer
		suma = suma + num
		i = i + 1
		Escribir "Ingrese un numero entero"
		Leer num
	Fin Mientras
	
	promedio = suma / i
	
	Escribir "El promedio de tus ", i, " numeros es ", promedio
	
	
FinAlgoritmo
