Algoritmo AreaConFuncion
	
	Definir rad, resultado Como Real
	Escribir "Ingrese un radio:"
	Leer rad
	resultado = area_circulo(rad)
	Escribir "El area del circulo con radio ", rad, " es ", resultado
	
FinAlgoritmo

Funcion area <- area_circulo(radio)
	
	Definir area Como Real
	area = 3.1416 * radio * radio
	
Fin Funcion