Algoritmo Encuentro12_13_14Guia4Ejercicio2
	
	//Realiza una funci�n llamada Cooperar que reciba dos variables de tipo car�cter, una variable debe
	//contener el mensaje "Cooperando" y la otra "trabajamos mejor". La funci�n debe concatenar
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