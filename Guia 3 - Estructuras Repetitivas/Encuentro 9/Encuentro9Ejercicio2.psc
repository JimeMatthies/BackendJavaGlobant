Algoritmo Encuentro9Ejercicio2
	
	//Realizar un programa que pida una frase y el programa deber� mostrar la frase con un
	//espacio entre cada letra. La frase se mostrar� as�: H o l a. Nota: recordar el
	//funcionamiento de la funci�n Subcadena().
	//NOTA:. En PseInt, si queremos escribir sin que haya saltos de l�nea, al final de la
	//operaci�n "escribir" escribimos "sin saltar". Por ejemplo:
		//Escribir sin saltar "Hola, "
		//Escribir sin saltar "c�mo est�s?"
		//Imprimir� por pantalla: Hola, c�mo est�s?
	
	
	Definir frase Como Caracter
	Definir i Como Entero
	
	Escribir "Ingrese una frase"
	Leer frase
	
	Escribir "La frase con espacios es: "
	Para i <- 0 Hasta Longitud(frase) Hacer
		Escribir Sin Saltar SubCadena(frase,i,i)
		Escribir Sin Saltar " "
	Fin Para
	
	Escribir " "
	
FinAlgoritmo
