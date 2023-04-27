Algoritmo Encuentro18_19_20_21Ejercicio1
	
	//Realizar un programa que rellene un vector con 5 valores ingresados por el usuario y los muestre por pantalla.
	
	Definir valores, i Como Entero
	Dimension valores(5)
	
	Escribir "Ingresa 5 números enteros:"
	
	Para i = 0 Hasta 4 Hacer
		Leer valores(i)
	Fin Para
	
	Escribir "Los números ingresados son:"
	
	Para i = 0 Hasta 4 Hacer
		Si i = 4 Entonces
			Escribir valores(i)
		SiNo
			Escribir Sin Saltar valores(i), ", "
		Fin Si
	Fin Para
	
FinAlgoritmo
