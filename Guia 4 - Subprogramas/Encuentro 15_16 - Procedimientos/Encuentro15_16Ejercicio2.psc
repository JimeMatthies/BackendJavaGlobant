Algoritmo Encuentro15_16Ejercicio2
	
	//Crear un procedimiento que calcule la temperatura media de un d�a a partir de la temperatura
	//m�xima y m�nima. Crear un programa principal, que, utilizando un procedimiento, vaya
	//pidiendo la temperatura m�xima y m�nima de n d�as y vaya mostrando la media de cada d�a. El
	//programa pedir� el n�mero de d�as que se van a introducir.
	
	Definir max, min, dias, i Como Entero
	Definir media Como Real
	
	Escribir "Ingresar la cantidad de d�as:"
	Leer dias
	
	Para i=1 Hasta dias Hacer
		Escribir "Ingresar la temperatura m�xima del ", i, "� d�a"
		Leer max
		Escribir "Ingresar la temperatura m�nima del ", i, "� d�a"
		Leer min
		TemperaturaMedia(max, min, media)
		Escribir "La temperatura media del ", i, "� d�a es ", media
		Escribir " "
	Fin Para
FinAlgoritmo

Subproceso TemperaturaMedia(max Por Valor, min Por Valor, media Por Referencia)
	media = (max + min) / 2
FinSubProceso