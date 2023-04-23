Algoritmo Encuentro3Ejercicio2
	
	//Escribir un programa que calcule el volumen de un cilindro. Para ello se deberá solicitar al
	//usuario que ingrese el radio y la altura. Mostrar el resultado por pantalla.
	//volumen = ? * radio2 * altura
	
	Definir volumen, altura, radio Como Real
	
	Escribir "Ingresa la altura del cilindro"
	Leer altura
	Escribir "Ingresa el radio del cilindro"
	Leer radio
	
	volumen = PI * radio^2 * altura
	
	Escribir "El volumen del cilindro es: ", volumen
	
FinAlgoritmo
