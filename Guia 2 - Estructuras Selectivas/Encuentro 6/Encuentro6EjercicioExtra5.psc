Algoritmo Encuentro6EjercicioExtra5
	
	//Realice un programa que, dado un año, nos diga si es bisiesto o no. Un año es bisiesto
	//bajo las siguientes condiciones: Un año divisible por 4 es bisiesto y no debe ser divisible
	//por 100. Si un año es divisible por 100 y además es divisible por 400, también resulta
	//bisiesto. Nota: recuerde la función mod de PseInt
	
	Definir aaaa Como Entero
	Escribir "Ingrese un año (aaaa)"
	Leer aaaa
	
	Si aaaa MOD 4 = 0 Entonces
		Si aaaa MOD 100 <> 0 Entonces
			Escribir "El año ", aaaa, " es año bisiesto."
		SiNo
			Si aaaa MOD 400 = 0 Entonces
				Escribir "El año ", aaaa, " es año bisiesto."
			SiNo
				Escribir "El año ", aaaa, " no es año bisiesto"
			Fin Si
		Fin Si
	SiNo
		Escribir "El año ", aaaa, " no es año bisiesto"
	Fin Si
	
FinAlgoritmo
