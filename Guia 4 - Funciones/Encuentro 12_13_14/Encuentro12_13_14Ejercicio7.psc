Algoritmo Encuentro12_13_14Ejercicio7
	
	//Dise�ar una funci�n que reciba un numero en forma de cadena y lo devuelva como numero
	//entero. El programa podr� recibir n�meros de hasta 3 d�gitos. Nota: no poner n�meros con
	//decimales ni letras. Ejemplo: ingresando "100"(car�cter) debe convertirse en 100(entero).
	
	Definir num Como Caracter
	Definir n, i Como Entero
	
	Repetir
		Escribir "Escriba un numero entero de m�ximo 3 digitos:"
		Leer num
	Mientras Que Longitud(num) > 3 o Longitud(num) <= 0
	
	n = CadenaTxt(num)
	Escribir n
	
FinAlgoritmo

Funcion retorno <- CadenaTxt (num Por Referencia)
	
	Definir retorno Como Entero
	
	retorno = ConvertirANumero(num)
	
FinFuncion