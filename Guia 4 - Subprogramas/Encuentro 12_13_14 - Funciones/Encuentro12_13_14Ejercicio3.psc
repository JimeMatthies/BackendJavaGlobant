Algoritmo Encuentro12_13_14Ejercicio3
	
	//Crea una funci�n EsMultiplo que reciba los dos n�meros pasados por el usuario, validando
	//que el primer n�mero m�ltiplo del segundo y devuelva verdadero si el primer n�mero es
	//m�ltiplo del segundo, sino es m�ltiplo que devuelva falso.
	
	Definir num1, num2 Como Entero
	
	Escribir "Ingrese el numero entero que desea confirmar:"
	Leer num1
	Escribir "Ingrese el numero multiplo por el que desa confirmar:"
	Leer num2
	Escribir "�El n�mero ", num1, " es m�ltiplo de ", num2, " ?: ", EsMultiplo(num1,num2)
	
FinAlgoritmo

Funcion retorno <- EsMultiplo (num1 Por Referencia, num2 Por Referencia)
	
	Definir retorno Como Logico
	retorno = (num1 MOD num2 == 0)
Fin Funcion