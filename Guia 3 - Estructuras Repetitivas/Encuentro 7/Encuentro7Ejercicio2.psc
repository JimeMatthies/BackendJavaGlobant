Algoritmo Encuentro7Ejercicio2
	
	//Escriba un programa en el cual se ingrese un valor l�mite positivo, y a continuaci�n
	//solicite n�meros al usuario hasta que la suma de los n�meros introducidos supere el
	//l�mite inicial.
	
	Definir limite, num, suma Como Entero
	
	limite = abs(Aleatorio(1,99999))
	suma = 0
	
	Escribir "Ingrese un numero entero"
	Leer num
	suma = suma + num
	
	Mientras suma < limite Hacer
		suma = suma + num
		Escribir "Ingrese un numero entero"
		Leer num
	Fin Mientras
		
	Escribir "La suma de los numeros ingresados es ", suma, " y ha superado el limite que era ", limite
	
FinAlgoritmo
