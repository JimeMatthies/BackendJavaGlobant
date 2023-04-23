Algoritmo Encuentro12_13_14Ejercicio10
	
	//Realizar una función que calcule la suma de los dígitos de un número.
	//Ejemplo: 25 = 2 + 5 = 7
	//Nota: Para obtener el último número de un digito de 2 cifras o más debemos pensar en el
	//resto de una división entre 10. Recordar el uso de la función Mod y Trunc.
	
	Definir num, resultado Como Entero
	
	Escribir "Ingrese un numero entero:"
	Leer num
	resultado = Sumar(num)
	Escribir "La suma de los digitos de ", num, " es: " resultado
	
FinAlgoritmo

Funcion retorno <- Sumar (num Por Referencia)
	
	Definir retorno, suma, n Como Entero
	
	suma = 0
	n = num
	Mientras n <> 0 Hacer
		suma = suma + (n MOD 10)
		n = trunc(n/10)
	Fin Mientras
	
	retorno = suma
	
FinFuncion