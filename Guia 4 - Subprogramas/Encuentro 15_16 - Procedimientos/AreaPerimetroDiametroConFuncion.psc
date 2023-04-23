Algoritmo AreaPerimetroDiametroConFuncion
	
	Definir rad, per, diam Como Real
	Escribir "Ingrese un radio de un circulo:"
	Leer rad
	perimetroYdiametro(rad, per, diam)
	Escribir "Perimetro: ", per
	Escribir "Diametro: ", diam
	Escribir "Area: ", area_circulo(rad)
	
FinAlgoritmo

SubProceso perimetroYdiametro(radio Por Valor, perimetro Por Referencia, diametro Por Referencia)
	
	perimetro = 3.1416 * radio * 2
	diametro = radio * 2
	
FinSubProceso

Funcion area <- area_circulo(radio)
	
	Definir area Como Real
	area = 3.1416 * radio * radio
	
Fin Funcion