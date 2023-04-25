Algoritmo Encuentro15_16Ejercicio4
	
	//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y
	//terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera:
	//Cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres
	//(incluyendo a las vocales acentuadas) se mantienen sin cambios.
		//  a e i o u
		//  @ # $ % *
	//Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
	//correspondiente. Utilice la estructura "según" para la transformación.
	//Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
	//La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
	//NOTA: investigue el uso de la función concatenar de PSeInt para armar la palabra/frase.
	
	Definir frase Como Caracter
	Escribir "Ingrese la frase a codificar:"
	Leer frase
	Codificar(frase)
	
FinAlgoritmo

SubProceso Codificar(frase Por Valor)
	Definir i Como Entero
	Definir codigo Como Cadena
	codigo = ""
	Si Subcadena(frase, (Longitud(frase) - 1), (Longitud(frase) - 1)) == "." Entonces
		Para i = 0 Hasta Longitud(frase) Hacer
			Segun SubCadena(Minusculas(frase), i, i) Hacer
				"a":
					codigo = Concatenar(codigo, "@")
				"e":
					codigo = Concatenar(codigo, "#")
				"i":
					codigo = Concatenar(codigo, "$")
				"o":
					codigo = Concatenar(codigo, "%")
				"u":
					codigo = Concatenar(codigo, "*")
				De Otro Modo:
					codigo = Concatenar(codigo, Subcadena(frase, i, i))
			FinSegun
		FinPara
	SiNo
		Escribir frase
	FinSi
	
	Escribir codigo
	
FinSubProceso
