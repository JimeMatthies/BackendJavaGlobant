Algoritmo Encuentro18_19_20_21Guia5Ejercicio1
	
	//Define un vector que alojará números enteros y otro de cadena. Dimensiona ambos de la longitud
	//que tu desees. Ahora en lapiz y papel, escribe la dimensión de tus vectores y sus subíndices.
	
	//Ahora es tu turno. Llena uno de los vectores que definiste y dimensionaste anteriormente, de
	//forma manual y el otro con un Bucle Para.
	
	//Ahora te toca a ti mostrar tus vectores. Además, define una nueva variable y aloja allí algún valor del vector.
	
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
	vectorcadena[3] = "tú "
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
