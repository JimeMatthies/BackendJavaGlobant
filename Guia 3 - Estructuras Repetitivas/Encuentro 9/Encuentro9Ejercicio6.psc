Algoritmo Encuentro9Ejercicio6
	
	//Siguiendo el ejercicio 2 de los ejercicios principales, ahora deberemos hacer lo mismo
	//pero que la cadena se muestre al revés. Por ejemplo, si tenemos la cadena: Hola,
	//deberemos mostrar a l o H.
	
	Definir frase Como Caracter
	Definir i Como Entero
	
	Escribir "Ingrese una frase"
	Leer frase
	
	Escribir "La frase con espacios y al revés es: "
	Para i = Longitud(frase) Hasta 0 Con Paso -1 Hacer
		Escribir Sin Saltar SubCadena(frase,i,i)
		Escribir Sin Saltar " "
	Fin Para
	
	Escribir " "
	
FinAlgoritmo
