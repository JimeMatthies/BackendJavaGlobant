Algoritmo Encuentro7Ejercicio5
	
	//Escriba un programa que solicite dos n�meros enteros (m�nimo y m�ximo). A
	//ontinuaci�n, se debe pedir al usuario que ingrese n�meros enteros situados entre el
	//m�ximo y m�nimo. Cada vez que un n�mero se encuentre entre ese intervalo, se sumara
	//uno a una variable. El programa terminar� cuando se escriba un n�mero que no
	//pertenezca a ese intervalo, y al finalizar se debe mostrar por pantalla la cantidad de
	//n�meros ingresados dentro del intervalo.
	
	Definir min, max, num, i Como Entero
	Escribir "Ingrese un numero entero m�nimo"
	Leer min
	Escribir "Ingrese un numero entero m�ximo"
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
