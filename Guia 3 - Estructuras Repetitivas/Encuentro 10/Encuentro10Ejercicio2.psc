Algoritmo Encuentro10Ejercicio2
	
	//Realizar un programa que lea un n�mero entero (tama�o del lado) y a partir de �l cree
	//un cuadrado de asteriscos de ese tama�o. Los asteriscos s�lo se ver�n en el borde del
	//cuadrado, no en el interior. Por ejemplo, si se ingresa el n�mero 4 se debe mostrar:
	//	* * * *
	//	*     *
	//	*     *
	//	* * * *
	//Nota: Recordar el uso del escribir sin saltar en PseInt.
	
	Definir n, i, j Como Entero
	
	Repetir
		Escribir "Ingrese un n�mero entero:"
		Leer n
	Mientras Que n <= 0
	
	Para i = 1 Hasta n Hacer
		Para j = 1 Hasta n Hacer
			Si i > 1 y i < n y j > 1 y j < n Entonces
				Escribir Sin Saltar "  "
			SiNo
				Escribir Sin Saltar "* "
			Fin Si
		Fin Para
		Escribir " "
	Fin Para
	
	Escribir " "
	
FinAlgoritmo
