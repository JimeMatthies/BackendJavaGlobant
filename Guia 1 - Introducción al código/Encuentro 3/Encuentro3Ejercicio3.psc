Algoritmo Encuentro3Ejercicio3
	
	//A partir de una conocida cantidad de días que el usuario ingresa a través del teclado, escriba
	//un programa para convertir los días en horas, en minutos y en segundos. Por ejemplo:
		//1 día = 24 horas = 1440 minutos = 86400 segundos
	
	Definir dias, horas, min, seg Como Entero
	
	Escribir "Ingresa la cantidad de días"
	Leer dias
	horas = dias * 24
	min = 60 * horas
	seg = 60 * min
	
	Escribir "La cantidad de horas son: ", horas	
	Escribir "La cantidad de minutos son: ", min
	Escribir "La cantidad de segundos son: ", seg	
	
	
FinAlgoritmo
