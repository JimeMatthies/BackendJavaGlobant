Algoritmo Encuentro2Ejercicio1
	
	//Conocido el n�mero en matem�tica PI ?, pedir al usuario que ingrese el valor del radio de
	//una circunferencia y calcular y mostrar por pantalla el �rea y per�metro. Recuerde que para
	//calcular el �rea y el per�metro se utilizan las siguientes f�rmulas:
		//area = PI * radio2
		//perimetro = 2 * PI * radio
	
	Definir radio, area, perimetro Como Real
	
	Escribir "Ingresar el Radio del Circulo"
	Leer radio
	
	area = PI*(radio^2)
	perimetro = radio*2*PI
	
	
	Escribir "El Area del circulo es: ", area
	Escribir "El Perimetro del circulo es: ", perimetro
	
FinAlgoritmo
