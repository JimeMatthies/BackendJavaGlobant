Algoritmo Encuentro3Ejercicio4
	
	//Crear un programa que solicite al usuario que ingrese el precio de un producto al inicio del
	//a�o, y el precio del mismo producto al finalizar el a�o. El programa debe calcular cu�l fue el
	//porcentaje de aumento que tuvo ese producto en el a�o y mostrarlo por pantalla.
	
	Definir precio1, precio2, incremento, porcentaje Como Real
	
	Escribir "Escribir el valor del precio inicial:"
	Leer precio1
	Escribir "Escribir el valor del precio final:"
	Leer precio2
	
	incremento = precio2 - precio1
	porcentaje = (incremento / precio1) * 100
	
	Escribir "El porcentaje de incremento de los precios es: ", porcentaje, " %"
	
FinAlgoritmo
