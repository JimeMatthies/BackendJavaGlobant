Algoritmo Encuentro15_16Ejercicio8
	
	//Realice un algoritmo que solicite al usuario una fecha y muestre por pantalla la fecha anterior.
	//Para ello se deberá utilizar un procedimiento llamado diaAnterior que reciba una fecha
	//representada a través de tres enteros dia, mes y anio, y retorne la fecha anterior. Puede
	//asumir que dia, mes y anio representan una fecha válida. Realice pruebas de escritorio para
	//los valores dia=5, mes=10, anio=2012 y para dia=1, mes=3, anio=2004.
	
	DiaAnterior()
	
FinAlgoritmo

SubProceso DiaAnterior
	
	Definir dia, mes, anio, dia_anterior, mes_anterior, anio_anterior Como Entero
	
	Repetir
		Escribir "Ingrese una fecha válida:"
		
		Repetir
			Escribir "Año:"
			Leer anio
		Hasta Que anio > 0
		
		Repetir
			Escribir "Mes:"
			Leer mes
		Hasta Que mes > 0 Y mes < 13
		
		Repetir
			Escribir "Día:"
			Leer dia
		Hasta Que dia > 0 Y dia < 32
		
	Mientras Que (dia = 31 Y (mes = 4 O mes = 6 O mes = 9 O mes = 11)) O (mes = 2 Y dia > 29) O (mes = 2 Y dia = 29 Y (anio MOD 4 <> 0 O anio MOD 100 = 0) Y anio MOD 400 <> 0)
	
	dia_anterior = dia - 1
	mes_anterior = mes
	anio_anterior = anio
	
	Si dia = 1 Y mes = 3 Y (anio MOD 400 = 0 O (anio MOD 4 = 0 y anio MOD 100 <> 0))Entonces
        dia_anterior = 29
        mes_anterior = 2
    SiNo
		Si dia = 1 Y mes = 3 Entonces
			dia_anterior = 28
			mes_anterior = 2
		SiNo
			Si dia = 1 Y (mes = 5 O mes = 7 O mes = 10 O mes = 12) Entonces
				dia_anterior = 30
				mes_anterior = mes - 1
			SiNo
				Si dia = 1 Y (mes = 2 O mes = 4 O mes = 6 O mes = 8 O mes = 9 O mes = 11) Entonces
					dia_anterior = 31
					mes_anterior = mes - 1
				SiNo
					Si dia = 1 Y mes = 1 Entonces
						dia_anterior = 31
						mes_anterior = 12
						anio_anterior = anio - 1
					SiNo
						dia_anterior = dia - 1
						mes_anterior = mes
						anio_anterior = anio
					Fin Si
				Fin Si
			FinSi
		Fin Si
    FinSi
	
	Escribir "Fecha anterior:"
	Escribir dia_anterior, " / ", mes_anterior, " / ", anio_anterior

FinSubProceso