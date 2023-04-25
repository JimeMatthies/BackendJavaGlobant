Algoritmo Encuentro15_16Ejercicio8
	
	//Realice un algoritmo que solicite al usuario una fecha y muestre por pantalla la fecha anterior.
	//Para ello se deberá utilizar un procedimiento llamado diaAnterior que reciba una fecha
	//representada a través de tres enteros dia, mes y anio, y retorne la fecha anterior. Puede
	//asumir que dia, mes y anio representan una fecha válida. Realice pruebas de escritorio para
	//los valores dia=5, mes=10, anio=2012 y para dia=1, mes=3, anio=2004.
	
	Definir dia, mes, anio Como Entero
	Escribir "Ingrese una fecha:"
	Escribir "Día:"
	Leer dia
	Escribir "Mes:"
	Leer mes
	Escribir "Año:"
	Leer anio
	DiaAnterior(dia, mes, anio)
	
FinAlgoritmo

SubProceso DiaAnterior(dia Por Referencia, mes Por Referencia, anio Por Referencia)
	
	Si (dia < 1 O dia > 31) O (mes = 2 Y dia > 29) O ((mes = 4 O mes = 6 O mes = 9 O mes = 11) Y dia = 31) O (mes = 2 Y dia = 29 Y (anio MOD 4 <> 0 O anio MOD 100 = 0) Y anio MOD 400 <> 0) Entonces
        Escribir "Día incorrecto"
		Escribir "Ingrese una fecha válida:"
		Escribir "Día:"
		Leer dia
		Escribir "Mes:"
		Leer mes
		Escribir "Año:"
		Leer anio
    FinSi
	
	Si mes < 1 O mes > 12 Entonces
        Escribir "Mes incorrecto"
		Escribir "Ingrese una fecha válida:"
		Escribir "Día:"
		Leer dia
		Escribir "Mes:"
		Leer mes
		Escribir "Año:"
		Leer anio
    FinSi
	
	Si mes = 1 Entonces
        anio = anio - 1
        mes = 12
    FinSi
	
	Si dia = 1 Y mes = 3 Y (((anio MOD 4 = 0) Y (anio MOD 100 <> 0)) O anio MOD 400 = 0) Entonces
        dia = 29
    FinSi
	
	Si dia = 1 Y mes = 3 Entonces
        dia = 28
    FinSi
	
	Si dia = 1 Y (mes = 4 O mes = 6 O mes = 9 O mes = 11) Entonces
        dia = 30
    FinSi
	
	Si dia = 1 Entonces
        dia = 31
        mes = mes -1
    FinSi

	
    Escribir "La fecha del día anterior es: ", dia, "/", mes, "/", anio
	
FinSubProceso