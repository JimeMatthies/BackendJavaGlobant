Algoritmo Encuentro6EjercicioExtra5
	
	//Realice un programa que, dado un a�o, nos diga si es bisiesto o no. Un a�o es bisiesto
	//bajo las siguientes condiciones: Un a�o divisible por 4 es bisiesto y no debe ser divisible
	//por 100. Si un a�o es divisible por 100 y adem�s es divisible por 400, tambi�n resulta
	//bisiesto. Nota: recuerde la funci�n mod de PseInt
	
	Definir aaaa Como Entero
	Escribir "Ingrese un a�o (aaaa)"
	Leer aaaa
	
	Si aaaa MOD 4 = 0 Entonces
		Si aaaa MOD 100 <> 0 Entonces
			Escribir "El a�o ", aaaa, " es a�o bisiesto."
		SiNo
			Si aaaa MOD 400 = 0 Entonces
				Escribir "El a�o ", aaaa, " es a�o bisiesto."
			SiNo
				Escribir "El a�o ", aaaa, " no es a�o bisiesto"
			Fin Si
		Fin Si
	SiNo
		Escribir "El a�o ", aaaa, " no es a�o bisiesto"
	Fin Si
	
FinAlgoritmo
