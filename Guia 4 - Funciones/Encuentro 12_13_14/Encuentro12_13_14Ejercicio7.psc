Algoritmo Encuentro12_13_14Ejercicio7
	
	//Diseñar una función que reciba un numero en forma de cadena y lo devuelva como numero
	//entero. El programa podrá recibir números de hasta 3 dígitos. Nota: no poner números con
	//decimales ni letras. Ejemplo: ingresando "100"(carácter) debe convertirse en 100(entero).
	
	Definir num Como Caracter
	Definir n, i Como Entero
	
	Repetir
		Escribir "Escriba un numero entero de máximo 3 digitos:"
		Leer num
	Mientras Que Longitud(num) > 3 o Longitud(num) <= 0
	
	n = CadenaTxt(num)
	Escribir n
	
FinAlgoritmo

Funcion retorno <- CadenaTxt (num Por Referencia)
	
	Definir retorno Como Entero
	
	retorno = ConvertirANumero(num)
	
FinFuncion