Algoritmo Encuentro12_13_14Ejercicio5
	
	//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
	//primo o no. Un n�mero es primo cuando es divisible s�lo por 1 y por s� mismo, por ejemplo: 2,
	//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.
	
	Definir num Como Entero
	
	Escribir "Ingrese un numero entero"
	Leer num
	Escribir "�El n�mero ", num, " es primo?: ", NumeroPrimo(num)
	
FinAlgoritmo

Funcion retorno <- NumeroPrimo (num Por Referencia)
	Definir retorno Como Logico
	Definir i, contador Como Entero
	
	contador = 0	
	Para i = 1 Hasta num Hacer
		Si (num MOD i == 0) Entonces
			contador = contador + 1
		Fin Si
	Fin Para
	
	retorno = (contador == 2)

Fin Funcion