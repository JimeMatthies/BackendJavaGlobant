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

SubProceso EliminarRepetidas(frase Por Referencia)
	
	Definir i, contador Como Entero
	Definir codigo Como Cadena
	codigo = ""
	
	Para i = 0 Hasta Longitud(frase) Hacer
		Segun Subcadena(Minusculas(frase), i, i) Hacer
			"a":
				contador = Buscar(codigo, "a")
				Si contador = 0 Entonces
					codigo = Concatenar(codigo, Subcadena(frase, i, i))
				SiNo
					codigo = codigo
				Fin Si
			"e":
				contador = Buscar(codigo, "e")
				Si contador = 0 Entonces
					codigo = Concatenar(codigo, Subcadena(frase, i, i))
				SiNo
					codigo = codigo
				Fin Si
			"i":
				contador = Buscar(codigo, "i")
				Si contador = 0 Entonces
					codigo = Concatenar(codigo, Subcadena(frase, i, i))
				SiNo
					codigo = codigo
				Fin Si
			"o":
				contador = Buscar(codigo, "o")
				Si contador = 0 Entonces
					codigo = Concatenar(codigo, Subcadena(frase, i, i))
				SiNo
					codigo = codigo
				Fin Si
			"u":
				contador = Buscar(codigo, "u")
				Si contador = 0 Entonces
					codigo = Concatenar(codigo, Subcadena(frase, i, i))
				SiNo
					codigo = codigo
				Fin Si
			De Otro Modo:
				codigo = Concatenar(codigo, Subcadena(frase, i, i))
		Fin Segun
	FinPara
	
	Escribir codigo
	
FinSubProceso

Funcion cantidad <- Buscar (frase Por Referencia, letra Por Valor)	
	Definir cantidad, i, j Como Entero
	cantidad = 0
	Para i = 0 Hasta Longitud(frase) Hacer
		Si Minusculas(letra) = Subcadena(Minusculas(frase), i, i) Entonces
			cantidad = cantidad + 1
		Fin Si
	Fin Para
FinFuncion