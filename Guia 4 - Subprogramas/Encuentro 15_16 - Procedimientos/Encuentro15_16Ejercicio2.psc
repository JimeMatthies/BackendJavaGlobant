Algoritmo Encuentro15_16Ejercicio2
	
	//Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura
	//máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya
	//pidiendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El
	//programa pedirá el número de días que se van a introducir.
	
	Definir max, min, dias, i Como Entero
	Definir media Como Real
	
	Escribir "Ingresar la cantidad de días:"
	Leer dias
	
	Para i=1 Hasta dias Hacer
		Escribir "Ingresar la temperatura máxima del ", i, "° día"
		Leer max
		Escribir "Ingresar la temperatura mínima del ", i, "° día"
		Leer min
		TemperaturaMedia(max, min, media)
		Escribir "La temperatura media del ", i, "° día es ", media
		Escribir " "
	Fin Para
FinAlgoritmo

Subproceso TemperaturaMedia(max Por Valor, min Por Valor, media Por Referencia)
	media = (max + min) / 2
FinSubProceso