Algoritmo Encuentro12_13_14Ejercicio11
	
	//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero
	//tiene todos sus d�gitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
	//numero en partes (si es un numero de m�s de un digito) y ver si cada n�mero es par o impar.
	//Nota: recordar el uso de la funci�n Mod y Trunc(). No podemos pasar el numero a cadena para realizar el ejercicio.
	
	Definir num Como Entero
	Definir resultado Como Logico
	
	Escribir "Ingrese un numero entero:"
	Leer num
	resultado = DigitosImpares(num)
	Escribir "El n�mero entero ", num, " tiene todos sus digitos impares?: " resultado
	
FinAlgoritmo

Funcion retorno <- DigitosImpares(num Por Referencia)
	
	Definir retorno Como Logico
	Definir digito, contador, n Como Entero
	
	digito = 0
	contador = 0
	n = num
	
	Mientras n <> 0 Hacer
		digito = n MOD 10
		Si (digito MOD 2 == 0) Entonces
			contador = contador + 1
		Fin Si
		n = trunc(n/10)
	Fin Mientras
	
	retorno = (contador == 0)
	
FinFuncion