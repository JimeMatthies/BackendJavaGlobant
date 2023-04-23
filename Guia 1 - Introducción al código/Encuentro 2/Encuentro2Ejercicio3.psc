Algoritmo Encuentro2Ejercicio3
	
	//A partir de una conocida cantidad de metros que el usuario ingresa a través del teclado se
	//debe obtener su equivalente en centímetros, en milímetros y en pulgadas.
	//Ayuda: 1 pulgada equivale a 2.54 centímetros.
	
	Definir metros, centimetros, milimetros, pulgadas Como Real
	
	Escribir "Inserte la cantidad de metros:"
	Leer metros
	
	centimetros = 100 * metros
	milimetros = 1000 * metros
	pulgadas = 2.54 * centimetros
	
	Escribir "La medida en centimetros es: ", centimetros, " cm"
	Escribir "La medida en milimetros es: ", milimetros, " mm"
	Escribir "La medida en pulgadas es: ", pulgadas, " in"
	
FinAlgoritmo
