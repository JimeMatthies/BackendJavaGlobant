Algoritmo Encuentro5Guia1Ejercicio1
	
	//Realizar un programa que pida al usuario el horario en el que se conect� al zoom. Si ese horario
	//est� entre la hora de ingreso y la hora de ingreso + los 15? de tardanza, mostrar� un mensaje por
	//pantalla que diga "Llegaste a tiempo, tienes presente". Si el horario de ingreso supera ese l�mite,
	//se mostrar� un mensaje por pantalla que diga "Hoy tendr�s tardanza. Recuerda avisarle a tus
	//coaches cuando llegar�s tarde. Ma�ana te esperamos a tiempo, tu participaci�n en el equipo es VITAL"
	
	Definir hora, min, tiempo Como Entero
	
	Escribir "Ingrese la hora y minutos en que se conecto a zoom"
	Escribir "Hora:"
	Leer hora
	Escribir "Minutos:"
	Leer min
	
	tiempo = (hora*60)+min
	
	Si tiempo <= 1095 Entonces
		Escribir "Llegaste a tiempo, tienes presente"
	SiNo 
		Escribir "Hoy tendr�s tardanza. Recuerda avisarle a tus coaches cuando llegar�s tarde. Ma�ana te esperamos a tiempo, tu participaci�n en el equipo es VITAL"
	FinSi
	
	
FinAlgoritmo
