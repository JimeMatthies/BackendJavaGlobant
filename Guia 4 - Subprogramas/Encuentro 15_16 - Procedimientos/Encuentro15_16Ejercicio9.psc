Algoritmo Encuentro15_16Ejercicio9
	
	//Diseñar un procedimiento que reciba una frase, y el programa remueva todas las vocales
	//repetidas. Al final el procedimiento mostrará la frase final.
	//Por ejemplo:
		//Entrada: "Habia una vez un barco"
		//Salida: "Habi un vez n brco"
	
	Definir frase Como Caracter
	Escribir "Ingrese la frase a codificar:"
	Leer frase
	EliminarRepetidas(frase)
	
FinAlgoritmo

Funcion cantidad <- Buscar (frase Por Referencia, letra Por Valor)
	
	Definir cantidad, i, j Como Entero
	cantidad = 0
	Para i = 0 Hasta Longitud(frase) Hacer
		Si Minusculas(letra) = Subcadena(Minusculas(frase), i, i) Entonces
			cantidad = cantidad + 1
		Fin Si
	Fin Para
	
FinFuncion

SubProceso EliminarRepetidas(frase Por Referencia)
	
	Definir i, contador, j Como Entero
	Definir codigo Como Cadena
	codigo = ""
	Para i = 0 Hasta Longitud(frase) Hacer
		Segun Subcadena(Minusculas(frase), i, i) Hacer
			"a":
				contador = Buscar(frase, Subcadena(frase, i, i))
				Si contador > 1 Entonces
					codigo = Concatenar(codigo, "D")
				Fin Si
			"e":
				codigo = Concatenar(codigo, Subcadena(frase, i, i))
			"i":
				codigo = Concatenar(codigo, Subcadena(frase, i, i))
			"o":
				codigo = Concatenar(codigo, Subcadena(frase, i, i))
			"u":
				codigo = Concatenar(codigo, Subcadena(frase, i, i))
			De Otro Modo:
				codigo = Concatenar(codigo, Subcadena(frase, i, i))
		Fin Segun
	FinPara
	
	Escribir codigo
	
FinSubProceso