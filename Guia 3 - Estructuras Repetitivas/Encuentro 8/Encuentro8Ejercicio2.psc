Algoritmo Encuentro8Ejercicio2
	
	//Escribir un programa que lea n�meros enteros hasta teclear 0 (cero). Al finalizar el
	//programa debe mostrar el m�ximo n�mero ingresado, el m�nimo, y el promedio de todos ellos.
	//Para poder lograr, por ejemplo, el m�ximo inicializaremos una variable en cero llamada
	//numeroMaximo. Luego iremos comparando cada n�mero que se ingresa con esta variable. Si es
	//mayor reemplazaremos el valor de numeroMaximo. Por ejemplo si 5>0 entonces el m�ximo entre
	//estos n�meros ser� 5. Si luego ingreso el n�mero 2, se eval�a 2>5 lo que resultar� falso y por lo
	//tanto el valor 5 de numeroMaximo no se reemplaza. Una l�gica similar tendr� el n�mero menor.
	
	Definir num, max, min, i Como Entero
	Definir total, promedio Como Real
	
	max = 0
	min = 0
	i = 0
	total = 0
	
	Repetir
		Escribir "Ingrese un numero entero"
		Leer num
		
		Si num <> 0 Entonces
			Si num > max Entonces
				max = num
			Fin Si
			
			Si i = 0 Entonces
				min = num
			SiNo
				Si num < min Entonces
					min = num
				Fin Si
			Fin Si
			
			i = i + 1
			total = total + num
			
		FinSi
		
	Mientras Que num <> 0
	
	promedio = total / i
	
	Escribir "Tu n�mero m�ximo ingresado es: ", max
	Escribir "Tu n�mero m�nimo ingresado es: ", min
	Escribir "El promedio de los ", i, " numeros que ingresaste es: ", promedio
	
FinAlgoritmo
