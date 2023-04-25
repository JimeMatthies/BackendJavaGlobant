Algoritmo Encuentro15_16Ejercicio5
	
	//Crea un procedimiento "convertirEspaciado", que reciba como argumento un texto y muestra
	//una cadena con un espacio adicional tras cada letra.
	//Por ejemplo, "Hola, tú" devolverá "H o l a , t ú ". Crea un programa principal donde se use
	//dicho procedimiento.
	
	Definir frase Como Caracter
	Escribir "Ingrese la frase a codificar:"
	Leer frase
	ConvertirEspaciado(frase)
	
FinAlgoritmo

SubProceso ConvertirEspaciado(frase Por Valor)
	Definir i Como Entero
	Definir codigo Como Cadena
	codigo = ""
	
	Para i = 0 Hasta Longitud(frase) Hacer
		Si Subcadena(frase, i, i) = " " Entonces
			codigo = Concatenar(codigo, Subcadena(frase, i, i))
		SiNo
			codigo = Concatenar(codigo, Subcadena(frase, i, i)) + " "
		Fin Si
	FinPara
	
	Escribir codigo
	
FinSubProceso