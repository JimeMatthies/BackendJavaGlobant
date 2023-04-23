Algoritmo Encuentro8Ejercicio6
	
	//Se pide escribir un programa que calcule la suma de los N primeros números pares. Es
	//decir, si ingresamos el número 5 como valor de N, el algoritmo nos debe realizar la suma
	//de los siguientes valores: 2+4+6+8+10.
	
	Definir n, x Como Entero
	Definir pares Como Real
	
	Escribir "Cuantos numeros pares desea sumar"
	Leer n
	x = 1
	pares = 0
	
	Repetir
		pares = pares + (2*x)
		x = x + 1
	Mientras Que x <= n
	
	Escribir "La suma de los ", n, " primeros numeros pares es de ", pares
	
FinAlgoritmo
