Algoritmo Encuentro9Ejercicio3
	
	//Un docente de Programación tiene un listado de 3 notas registradas por cada uno de sus
	//N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
	//Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves
	//de sus estudiantes:
		//1) Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
		//reprueba el curso si tiene una nota final inferior a 6.5
		//2) Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
		//3) La mayor nota obtenida en las exposiciones.
		//4) Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
	//El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno pedirá
	//las 3 notas y calculará todos informes claves que requiere el docente.
	
	Definir i, alumnos Como Entero
	Definir notaIntegrador, notaExposicion, notaParcial, notaFinal, sumaNotaReprobados, alumnosReprobados, notaPromedioReprobados, alumnosIntegrador, porcentajeIntegrador, maxExposicion, alumnoMaxExpo, alumnosParcialMedia Como Real
	
	Escribir "Ingrese la cantidad de alumnos"
	Leer alumnos
	
	sumaNotaReprobados = 0
	alumnosReprobados = 0
	alumnosIntegrador = 0
	maxExposicion = 0
	alumnoMaxExpo = 0
	alumnosParcialMedia = 0
	
	Para i = 1 Hasta alumnos Hacer
		Escribir "Ingrese la nota del trabajo práctico integrador:"
		Leer notaIntegrador
		Escribir "Ingrese la nota de exposición:"
		Leer notaExposicion
		Escribir "Ingrese la nota parcial:"
		Leer notaParcial
		
		notaFinal = (notaIntegrador * 0.35) + (notaExposicion * 0.25) + (notaParcial * 0.4)
		Escribir "La nota final del estudiante ", i, " es: ", notaFinal
		
		Si notaFinal < 6.5 Entonces
			sumaNotaReprobados = sumaNotaReprobados + notaFinal
			alumnosReprobados = alumnosReprobados + 1
		Fin Si
		
		Si notaIntegrador > 7.5 Entonces
			alumnosIntegrador = alumnosIntegrador + 1
		Fin Si
		
		Si notaExposicion > maxExposicion Entonces
			maxExposicion = notaExposicion
			alumnoMaxExpo = i
		Fin Si
		
		Si notaParcial > 4 y notaParcial < 7.5 Entonces
			alumnosParcialMedia = alumnosParcialMedia + 1
		Fin Si
		
	Fin Para
	
	Escribir "Reportes finales:"
	
	notaPromedioReprobados = sumaNotaReprobados / alumnosReprobados
	
	Escribir "La nota promedio de los ", alumnosReprobados ," alumnos que reprobaron es de: ", notaPromedioReprobados
	
	porcentajeIntegrador = (alumnosIntegrador / (alumnos)) * 100
	
	Escribir "El porcentaje de alumnos que tienen una nota de integrador mayor a 7.5 es de: ", porcentajeIntegrador, " %"
	
	Escribir "La mayor nota obtenida en las exposiciones es: ", maxExposicion, " y corresponde al alumno ", alumnoMaxExpo
	
	Escribir "El total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5 es de: ", alumnosParcialMedia

FinAlgoritmo
