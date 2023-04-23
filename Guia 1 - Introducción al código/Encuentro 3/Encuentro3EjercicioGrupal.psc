Algoritmo Encuentro3EjercicioGrupal
	
	//Ingrese un número de tres cifras y muestre la unidad , la decena y la centena.
	//Ejemplo: 123 -  Centena:1, Decena:2, Unidad:3
	
	Definir num, centena, decena, unidad Como Real
	
	Escribir "Ingresa un numero de 3 digitos:"
	Leer num
	
	centena = trunc(num/100)%10
	decena = trunc(num/10)%10
	unidad = num%10
	
	Escribir "Centenas: ", centena
	Escribir "Decenas: ", decena
	Escribir "Unidad: ", unidad
	
FinAlgoritmo
