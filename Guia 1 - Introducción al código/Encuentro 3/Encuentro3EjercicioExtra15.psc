Algoritmo Encuentro3EjercicioExtra15
	
	//Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos. El tiempo
	//de viaje hasta llegar a otra ciudad B es de T segundos. Escribir un algoritmo que
	//determine la hora de llegada a la ciudad B.
	
	Definir hs, ms, ss, t, totals, hl, ml, sl Como Entero
	
	Escribir "Ingresa la hora de salida:"
	Leer hs
	Escribir "Ingresa los minutos de salida:"
	Leer ms
	Escribir "Ingresa los segundos de salida:"
	Leer ss
	Escribir "Ingresa los segundos de viaje"
	Leer t
	
	totals = (hs * 3600) + (ms * 60) + ss + t
	
	hl = totals/3600
	ml = totals - (hl*3600)
	sl = totals - (hl*3600) - (ml*60)
	
	
	
	Escribir totals
	Escribir hl
	Escribir ml
	Escribir sl
	
	
	
	
FinAlgoritmo
