Algoritmo Encuentro15_16Ejercicio3
	
	//Realizar un procedimiento que permita realizar la división entre dos números y muestre el
	//cociente y el resto utilizando el método de restas sucesivas.
	//El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta
	//obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas
	//realizadas es el cociente. Por ejemplo: 50 / 13:
		//50 - 13 = 37 una resta realizada
		//37 - 13 = 24 dos restas realizadas
		//24 - 13 = 11 tres restas realizadas
	//Dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
	
	Definir dividendo, divisor, cociente, residuo Como Entero
	Escribir "Ingrese el valor del dividendo:"
	Leer dividendo
	Escribir "Ingrese el valor del divisor:"
	Leer divisor
	RestasSucesivas(dividendo, divisor, cociente, residuo)
	Escribir "El cociente es: ", cociente
	Escribir "El residuo: ", residuo
	
	
FinAlgoritmo

SubProceso RestasSucesivas(dividendo Por Valor, divisor Por Valor, cociente Por Referencia, residuo Por Referencia)
	cociente = 0
	residuo = 0
	Mientras dividendo > divisor Hacer
		dividendo = dividendo - divisor
		cociente = cociente + 1
		residuo = dividendo
	Fin Mientras
FinSubProceso
