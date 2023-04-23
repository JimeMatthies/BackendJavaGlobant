Algoritmo Encuentro12_13_14Ejercicio13
	
	//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
	//capic�a o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc. No podemos
	//transformar el numero a cadena para realizar el ejercicio.
	
	Definir num Como Entero
	Definir resultado Como Logico
	
	Escribir "Ingrese un numero entero:"
	Leer num
	resultado = Capicua(num)
	Escribir "El n�mero entero ", num, " es capic�a?: " resultado
	
FinAlgoritmo

Funcion retorno <- Capicua(num Por Referencia)
	
	Definir retorno Como Logico
	Definir n, suma Como Entero
	
	n = num
	suma = 0

	Mientras n <> 0 Hacer
		suma = (suma * 10) +(n MOD 10)
		n = trunc(n/10)
	FinMientras
	
	retorno = (suma == num)
	
FinFuncion