Algoritmo Encuentro8Ejercicio2
	
	//Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
	//programa debe mostrar el máximo número ingresado, el mínimo, y el promedio de todos ellos.
	//Para poder lograr, por ejemplo, el máximo inicializaremos una variable en cero llamada
	//numeroMaximo. Luego iremos comparando cada número que se ingresa con esta variable. Si es
	//mayor reemplazaremos el valor de numeroMaximo. Por ejemplo si 5>0 entonces el máximo entre
	//estos números será 5. Si luego ingreso el número 2, se evalúa 2>5 lo que resultará falso y por lo
	//tanto el valor 5 de numeroMaximo no se reemplaza. Una lógica similar tendrá el número menor.
	
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
	
	Escribir "Tu número máximo ingresado es: ", max
	Escribir "Tu número mínimo ingresado es: ", min
	Escribir "El promedio de los ", i, " numeros que ingresaste es: ", promedio
	
FinAlgoritmo
