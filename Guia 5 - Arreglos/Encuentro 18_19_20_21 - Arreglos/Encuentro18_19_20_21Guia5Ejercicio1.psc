Algoritmo Encuentro18_19_20_21Guia5Ejercicio1
	
	//Define un vector que alojar� n�meros enteros y otro de cadena. Dimensiona ambos de la longitud
	//que tu desees. Ahora en lapiz y papel, escribe la dimensi�n de tus vectores y sus sub�ndices.
	
	//Ahora es tu turno. Llena uno de los vectores que definiste y dimensionaste anteriormente, de
	//forma manual y el otro con un Bucle Para.
	
	//Ahora te toca a ti mostrar tus vectores. Adem�s, define una nueva variable y aloja all� alg�n valor del vector.
	
	Definir vectorenteros, i Como Entero
	Definir vectorcadena, quien Como Caracter
	Dimension vectorenteros[5]
	
	Para i = 0 Hasta 4 Hacer
		vectorenteros[i] = i + 1
	Fin Para
	

	Dimension vectorcadena[5]
	
	vectorcadena[0] = "Hola, "
	vectorcadena[1] = "Como "
	vectorcadena[2] = "Estas "
	vectorcadena[3] = "t� "
	vectorcadena[4] = "hoy."
	
	Escribir vectorenteros[2]
	
	Escribir Sin Saltar "["
	Para i=0 Hasta 4 Hacer
		Si i = 4 Entonces
			Escribir Sin Saltar vectorenteros[i]
		SiNo
			Escribir Sin Saltar vectorenteros[i], ","
		Fin Si
	Fin Para
	Escribir "]"
	
	Para i=0 Hasta 4 Hacer
		Escribir Sin Saltar "[", vectorenteros[i], "]"
	Fin Para
	
	quien = vectorcadena[3]
	
	Escribir ""
	Escribir quien
	
FinAlgoritmo
