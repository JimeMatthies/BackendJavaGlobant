Algoritmo Encuentro12_13_14Ejercicio4
	
	//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La
	//función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la
	//función Subcadena().
	
	Definir frase, letra Como Caracter
	Definir contador Como Entero
	
	Escribir "Escriba una frase:"
	Leer frase
	Escribir "Escriba una letra:"
	Leer letra
	
	contador = Buscar(frase, letra)
	Escribir "En la frase ", frase, " la letra ", Minusculas(letra), " se encuentra ", contador, " veces."
	
FinAlgoritmo

Funcion cantidad <- Buscar (frase Por Referencia, letra Por Referencia)
	
	Definir cantidad, i Como Entero
	cantidad = 0
	Para i = 0 Hasta Longitud(frase) Hacer
		Si Minusculas(letra) = Subcadena(Minusculas(frase), i, i) Entonces
			cantidad = cantidad + 1
		Fin Si
	Fin Para
	
FinFuncion
