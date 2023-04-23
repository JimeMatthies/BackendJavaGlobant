Algoritmo Encuentro12_13_14Ejercicio3
	
	//Crea una función EsMultiplo que reciba los dos números pasados por el usuario, validando
	//que el primer número múltiplo del segundo y devuelva verdadero si el primer número es
	//múltiplo del segundo, sino es múltiplo que devuelva falso.
	
	Definir num1, num2 Como Entero
	
	Escribir "Ingrese el numero entero que desea confirmar:"
	Leer num1
	Escribir "Ingrese el numero multiplo por el que desa confirmar:"
	Leer num2
	Escribir "¿El número ", num1, " es múltiplo de ", num2, " ?: ", EsMultiplo(num1,num2)
	
FinAlgoritmo

Funcion retorno <- EsMultiplo (num1 Por Referencia, num2 Por Referencia)
	
	Definir retorno Como Logico
	retorno = (num1 MOD num2 == 0)
Fin Funcion