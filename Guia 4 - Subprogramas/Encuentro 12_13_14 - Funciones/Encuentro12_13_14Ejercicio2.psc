Algoritmo  Encuentro12_13_14Ejercicio2
	
	//Realizar una funci�n que valide si un n�mero es impar o no. Si es impar la funci�n debe
	//devolver un verdadero, si no es impar debe devolver falso. Nota: la funci�n no debe tener
	//mensajes que digan si es par o no, eso debe pasar en el Algoritmo.
	
	Definir num Como Entero
	
	Escribir "Ingrese un numero entero"
	Leer num
	Escribir "�El n�mero ", num, " es impar?: ", Imparidad(num)
	
FinAlgoritmo

Funcion retorno <- Imparidad (num Por Referencia)
	Definir retorno Como Logico
	retorno = (num MOD 2 <> 0)
Fin Funcion