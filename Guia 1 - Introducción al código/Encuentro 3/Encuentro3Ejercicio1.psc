Algoritmo Encuentro3Ejercicio1
	
	//Solicitar al usuario que ingrese la base y altura de un rectángulo, y calcular y mostrar por
	//pantalla el área y perímetro del mismo
	//area = base * altura
	//perimetro = 2 * altura + 2 * base.
	
	Definir area, perimetro, base, altura Como Real
	
	Escribir "Ingresar base del rectangulo"
	Leer base
	
	Escribir "Ingresar altura del rectangulo"
	Leer altura
	area = base * altura
	perimetro = (2 * base) + (2*altura)
	
	Escribir "El area del rectangulo es: ", area, " y el perimetro del rectangulo es: ", perimetro
	
FinAlgoritmo
