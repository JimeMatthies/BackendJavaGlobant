Algoritmo Encuentro6EjercicioExtra2
	
	//Leer tres n�meros que denoten una fecha (d�a, mes, a�o) y comprobar que sea una
	//fecha v�lida. Si la fecha no es v�lida escribir un mensaje de error por pantalla. Si la fecha
	//es v�lida se debe imprimir la fecha cambiando el n�mero que representa el mes por su
	//nombre. Por ejemplo: si se introduce 1 2 2006, se deber� imprimir "1 de febrero de 2006".
	
	Definir dd, mm, aaaa Como Entero
	Definir mes Como Caracter
	Escribir "Ingrese una fecha (dd-mm-aaaa) :"
	Escribir "D�a:"
	Leer dd
	Escribir "Mes:"
	Leer mm
	Escribir "A�o:"
	Leer aaaa
	
	Segun mm Hacer
		1:
			mes = "Enero"
		2:
			mes = "Febrero"
		3:
			mes = "Marzo"
		4:
			mes = "Abril"
		5: 
			mes = "Mayo"
		6:
			mes = "Junio"
		7:
			mes = "Julio"
		8:
			mes = "Agosto"
		9: 
			mes = "Septiembre"
		10:
			mes = "Octubre"
		11:
			mes = "Noviembre"
		12:
			mes = "Diciembre"
		De Otro Modo:
			Escribir "El mes no es un mes v�lido"
	Fin Segun
	
	Si dd > 31 Y dd < 1 Entonces
		Escribir "El dia no es no un dia v�lido"
	SiNo
		si mm > 12 Y mm < 1 Entonces
			Escribir "El mes no es un mes v�lido"
		SiNo
			si mm == 2 Y dd > 28 Entonces
				Escribir "Febrero no tiene mas de 28 d�as"
			SiNo
				Si (mm == 4 O mm==6 O mm==9 O mm==11) Y dd > 30 Entonces
					Escribir "Fecha no valida"
				Sino 
					Escribir "La fecha que ingresaste es ", dd, " de ",mes, " de " ,aaaa
					
				FinSi
			FinSi
		FinSi
	FinSi
		
FinAlgoritmo
