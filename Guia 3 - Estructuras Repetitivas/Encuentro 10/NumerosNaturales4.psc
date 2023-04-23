Algoritmo NumerosNaturales4
	
	//Muestre N sumatorias de los primeros números enteros partiendo desde cero, siendo N par.
	//De un aviso si el usuario identifica un valor N superior a 1000 por ejecución lenta.
	
	Definir num, suma, i, j Como Entero
	Definir confirma Como Caracter
	
	Hacer
		Escribir "Ingrese un número entero positivo"
		Leer num
		confirma = "s"
		Si num > 1000 Entonces
			Escribir "Este programa puede trabajar mucho en ejecutarse, ¿Desea continuar? (s/n)"
			Leer confirma
		FinSi
	Mientras Que num <= 0 o confirma <> "s"
	
	Para i = 2 Hasta num Con Paso 2 Hacer
		suma = 0
		Para j = 1 hasta i Hacer
			suma = suma + j
		FinPara
		Escribir "La suma de las ", i, " números naturales es: ", suma
	FinPara
	

	
FinAlgoritmo
