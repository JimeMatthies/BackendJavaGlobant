Algoritmo Encuentro6EjercicioExtra2
	
	//Leer tres números que denoten una fecha (día, mes, año) y comprobar que sea una
	//fecha válida. Si la fecha no es válida escribir un mensaje de error por pantalla. Si la fecha
	//es válida se debe imprimir la fecha cambiando el número que representa el mes por su
	//nombre. Por ejemplo: si se introduce 1 2 2006, se deberá imprimir "1 de febrero de 2006".
	
	Definir dd, mm, aaaa Como Entero
	Definir mes Como Caracter
	Escribir "Ingrese una fecha (dd-mm-aaaa) :"
	Escribir "Día:"
	Leer dd
	Escribir "Mes:"
	Leer mm
	Escribir "Año:"
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
			Escribir "El mes no es un mes válido"
	Fin Segun
	
	Si dd > 31 Y dd < 1 Entonces
		Escribir "El dia no es no un dia válido"
	SiNo
		si mm > 12 Y mm < 1 Entonces
			Escribir "El mes no es un mes válido"
		SiNo
			si mm == 2 Y dd > 28 Entonces
				Escribir "Febrero no tiene mas de 28 días"
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
