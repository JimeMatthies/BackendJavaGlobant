Algoritmo Encuentro12_13_14Ejercicio5
	
	//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
	//primo o no. Un número es primo cuando es divisible sólo por 1 y por sí mismo, por ejemplo: 2,
	//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.
	
	Definir num Como Entero
	
	Escribir "Ingrese un numero entero"
	Leer num
	Escribir "¿El número ", num, " es primo?: ", NumeroPrimo(num)
	
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