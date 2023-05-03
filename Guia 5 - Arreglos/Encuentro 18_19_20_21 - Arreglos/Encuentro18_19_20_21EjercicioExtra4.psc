Algoritmo Encuentro18_19_20_21EjercicioExtra4
	
	//Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre 0 y 20 generadas aleatoriamente
	//mediante el uso de la función azar() o aleatorio() de PseInt. Luego, de acuerdo a las notas contenidas, el programa
	//debe indicar cuántos estudiantes son:
		//a) Deficientes 0-5
		//b) Regulares 6-10
		//c) Buenos 11-15
		//d) Excelentes 16-20
	
	Definir Vector, i, deficientes, regulares, buenos, excelentes Como Entero
	Dimension Vector(100)
	
	deficientes = 0
	regulares = 0
	buenos = 0
	excelentes = 0
	
	Para i = 0 Hasta 99 Hacer
		Vector(i) = Azar(20) + 1
		Si Vector(i) < 6 Entonces
			deficientes = deficientes + 1
		SiNo
			Si Vector(i) < 11 Entonces
				regulares = regulares + 1
			SiNo
				Si Vector(i) < 16 Entonces
					buenos = buenos + 1
				SiNo
					excelentes = excelentes + 1
				Fin Si
			Fin Si
		Fin Si
	Fin Para
	
	Escribir "Alumnos con notas deficientes: ", deficientes
	Escribir "Alumnos con notas regulares: ", regulares
	Escribir "Alumnos con notas buenas: ", buenos
	Escribir "Alumnos con notas excelentes: ", excelentes
	
FinAlgoritmo
