Algoritmo Encuentro12_13_14Guia4Ejercicio2
	
	//Realiza una función llamada Cooperar que reciba dos variables de tipo carácter, una variable debe
	//contener el mensaje "Cooperando" y la otra "trabajamos mejor". La función debe concatenar
	//ambos textos.
	
	Definir a, b, resultado Como Caracter
	
	a = "Cooperando"
	b = "trabajamos mejor"
	resultado = cooperar(a, b)
	Escribir resultado
	
FinAlgoritmo

Funcion retorno <- cooperar ( a Por Referencia, b Por Referencia )
	
	Definir retorno Como Caracter
	
	retorno = a + " " + b
	//retorno = Concatenar(a,b)
	
Fin Funcion