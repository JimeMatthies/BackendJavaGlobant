Algoritmo Encuentro6EjercicioExtra3
	
	//Hacer un algoritmo que lea un n�mero por el teclado y determine si tiene tres d�gitos.
	
	Definir num Como Entero
	Escribir "ingerese un numero entero"
	Leer num
		
	Si Longitud(ConvertirATexto(num)) = 3 Entonces
		Escribir "El n�mero ", num, " tiene 3 d�gitos."
	SiNo
		Escribir "No hay 3 d�gitos en el n�mero ", num
	Fin Si
	
FinAlgoritmo
