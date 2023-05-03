Algoritmo Encuentro18_19_20_21Ejercicio6
	
	//Disponemos de un vector unidimensional de 20 elementos de tipo car�cter. Se pide desarrollar un programa que:
	//	a) Pida una frase al usuario y luego ingrese la frase dentro del arreglo letra por letra.
	//		Ayuda: utilizar la funci�n Subcadena de PSeInt.
	//	b) Una vez completado lo anterior, pedirle al usuario un car�cter cualquiera y una posici�n dentro del arreglo,
	//		y el programa debe intentar ingresar el car�cter en la posici�n indicada, si es que hay lugar (es decir la
	//		posici�n est� vac�a o es un espacio en blanco). De ser posible debe mostrar el vector con la frase y el car�cter ingresado,
	//		de lo contrario debe darle un mensaje al usuario de que esa posici�n estaba ocupada.
	//Por ejemplo, suponiendo la siguiente frase y los sub�ndices del vector:
	//	H	o	l	a		m	u	n	d	o		 c	 r	 u	 e	 l	 !
	//	0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18	19
	//Si se desea ingresar el car�cter "%" en la posici�n 10, entonces el resultado ser�a:
	//	H	o	l	a		m	u	n	d	o	 %	 c	 r	 u	 e	 l	 !
	//	0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18	19
	
	Definir vector, frase, letra Como Caracter
	Definir i, posicion Como Entero
	Dimension vector(20)
	
	Escribir "Ingrese una frase:"
	Leer frase
	Para i = 0 Hasta 19 Hacer
		vector(i) = Subcadena(frase, i, i)
	Fin Para
	
	Mostrarvector(vector)
	
	Escribir "Ingrese un caracter al arreglo:"
	Leer letra
	Escribir "En que posci�n desea ingresarlo?"
	Leer posicion
	
	Si posicion < 20 Y posicion > -1 Entonces
		Si vector(posicion) = " " o vector(posicion) = "" Entonces
			vector(posicion) = letra
			Escribir "Se ingreso el caracter"
		SiNo
			Escribir "La posici�n se encuentra ocupada"
		Fin Si
	SiNo
		Escribir "Posici�n inv�lida."
	FinSi
	
	Mostrarvector(vector)
	
FinAlgoritmo

Funcion Mostrarvector(vector)
	Definir i Como Entero
	Escribir Sin Saltar "Valores = "
	Para i = 0 Hasta 19 Hacer
		Escribir Sin Saltar "["
		Si vector(i) == "" Entonces
			Escribir Sin Saltar " "
		SiNo
			Escribir Sin Saltar vector(i)
		FinSi
		Si i < 10 Entonces
			Escribir Sin Saltar "]"
		SiNo
			Escribir Sin Saltar " ]"
		FinSi
	FinPara
	Escribir ""
	Escribir Sin Saltar "Indices = "
	Para i = 0 Hasta 19 Hacer
		Escribir Sin Saltar "[", i, "]"
	FinPara
	Escribir ""
FinFuncion