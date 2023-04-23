Algoritmo Encuentro7Ejercicio5
	
	//Escriba un programa que solicite dos números enteros (mínimo y máximo). A
	//ontinuación, se debe pedir al usuario que ingrese números enteros situados entre el
	//máximo y mínimo. Cada vez que un número se encuentre entre ese intervalo, se sumara
	//uno a una variable. El programa terminará cuando se escriba un número que no
	//pertenezca a ese intervalo, y al finalizar se debe mostrar por pantalla la cantidad de
	//números ingresados dentro del intervalo.
	
	Definir min, max, num, i Como Entero
	Escribir "Ingrese un numero entero mínimo"
	Leer min
	Escribir "Ingrese un numero entero máximo"
	Leer max
	Escribir "Ingrese un numero entero"
	Leer num
	i = 1
	
	Mientras num > min y num < max Hacer
		i = i + 1
		Escribir "Ingrese un numero entero"
		Leer num
	Fin Mientras
	
	Escribir "Ingresaste ", i, " numeros."
	
	
FinAlgoritmo
