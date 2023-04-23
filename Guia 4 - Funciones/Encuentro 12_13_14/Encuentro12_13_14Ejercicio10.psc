Algoritmo Encuentro12_13_14Ejercicio10
	
	//Realizar una funci�n que calcule la suma de los d�gitos de un n�mero.
	//Ejemplo: 25 = 2 + 5 = 7
	//Nota: Para obtener el �ltimo n�mero de un digito de 2 cifras o m�s debemos pensar en el
	//resto de una divisi�n entre 10. Recordar el uso de la funci�n Mod y Trunc.
	
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