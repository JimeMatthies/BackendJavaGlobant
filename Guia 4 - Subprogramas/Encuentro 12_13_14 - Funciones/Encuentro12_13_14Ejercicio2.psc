Algoritmo  Encuentro12_13_14Ejercicio2
	
	//Realizar una función que valide si un número es impar o no. Si es impar la función debe
	//devolver un verdadero, si no es impar debe devolver falso. Nota: la función no debe tener
	//mensajes que digan si es par o no, eso debe pasar en el Algoritmo.
	
	Definir num Como Entero
	
	Escribir "Ingrese un numero entero"
	Leer num
	Escribir "¿El número ", num, " es impar?: ", Imparidad(num)
	
FinAlgoritmo

Funcion retorno <- Imparidad (num Por Referencia)
	Definir retorno Como Logico
	retorno = (num MOD 2 <> 0)
Fin Funcion