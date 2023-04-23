Algoritmo Encuentro6EjercicioExtra3
	
	//Hacer un algoritmo que lea un número por el teclado y determine si tiene tres dígitos.
	
	Definir num Como Entero
	Escribir "ingerese un numero entero"
	Leer num
		
	Si Longitud(ConvertirATexto(num)) = 3 Entonces
		Escribir "El número ", num, " tiene 3 dígitos."
	SiNo
		Escribir "No hay 3 dígitos en el número ", num
	Fin Si
	
FinAlgoritmo
