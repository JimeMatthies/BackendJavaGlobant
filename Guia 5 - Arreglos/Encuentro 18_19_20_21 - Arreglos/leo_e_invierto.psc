Algoritmo leo_e_invierto
	
	Definir valores, i Como Entero
	Dimension valores(5)
	
	Escribir "Ingresa 5 valores enteros:"
	
	Para i = 0 Hasta 4 Hacer
		Leer valores(i)
	Fin Para
	
	Escribir "Los valores ingresados de forma invertida son:"
	
	Para i = 4 Hasta 0 Hacer
		Si i = 0 Entonces
			Escribir valores(i)
		SiNo
			Escribir Sin Saltar valores(i), ", "
		Fin Si
	Fin Para
	
FinAlgoritmo
