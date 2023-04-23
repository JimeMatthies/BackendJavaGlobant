Algoritmo Encuentro12_13_14Ejercicio6
	
	//Realizar una función que calcule y retorne la suma de todos los divisores del número n
	//distintos de n. El valor de n debe ser ingresado por el usuario.
	
	Definir num Como Entero
	
	Escribir "Ingrese un numero entero"
	Leer num
	Escribir "La suma de todos los divisores de ", num, " distinto de ", num, " es: ", SumarDivisores(num)
	
FinAlgoritmo

Funcion retorno <- SumarDivisores (num Por Referencia)
	
	Definir retorno, i, suma Como Entero
	
	suma = 0	
	Para i = 1 Hasta (num - 1) Hacer
		Si (num MOD i == 0) Entonces
			suma = suma + i
		Fin Si
	Fin Para
	
	retorno = suma
	
Fin Funcion