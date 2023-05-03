Algoritmo Encuentro18_19_20_21EjercicioExtra5
	
	//Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserción del carácter, facilitando
	//un potencial reordenamiento del vector. Digamos que se pide ingresar el carácter en la
	//posición X y la misma está ocupada, entonces de existir un espacio en cualquier posición X-n
	//o X+n, desplazar los caracteres hacia la izq o hacia la derecha para poder ingresar el carácter
	//en cuestión en el lugar deseado. El procedimiento de reordenamiento debe ubicar el espacio más cercano.
	
	Definir vector, frase, letra Como Caracter
	Definir i, posicion, atras, adelante Como Entero
	Definir atrasdisponible Como Logico
	Dimension vector(20)
	atrasdisponible = Falso
	atras = 0
	adelante = 0
	
	Escribir "Ingrese una frase:"
	Leer frase
	Para i = 0 Hasta 19 Hacer
		vector(i) = Subcadena(frase, i, i)
	Fin Para
	
	Mostrarvector(vector)
	
	Escribir "Ingrese un caracter al arreglo:"
	Leer letra
	Escribir "En que posción desea ingresarlo?"
	Leer posicion
	
	Si posicion < 20 Y posicion > -1 Entonces
		Si vector(posicion) = " " o vector(posicion) = "" Entonces
			vector(posicion) = letra
			Escribir "Se ingreso el caracter"
		SiNo
			Para i = posicion Hasta 0 Con Paso -1 Hacer
				Si Subcadena(frase,i,i) = " " O Subcadena(frase,i,i) = "" Entonces
					i = 0
					atrasdisponible = Verdadero
				SiNo
					atras = atras + 1
				FinSi
			FinPara
			Para i = posicion Hasta 19 Hacer
				Si Subcadena(frase,i,i) = " " O Subcadena(frase,i,i) = "" Entonces
					i = 19
				SiNo
					adelante = adelante + 1
				FinSi
			FinPara
			Si atras < adelante Y atrasdisponible Entonces
				Para i = 0 Hasta posicion Hacer
					vector(i) = vector(i+1)
				FinPara
				vector[posicion] = letra
				Escribir "Se corrio el vector hacia atras"
			SiNo
				Para i = 19 Hasta posicion Con Paso -1 Hacer
					vector(i) = vector(i-1)
				FinPara
				vector[posicion] = letra
				Escribir "Se corrio el vector hacia adelante."
			FinSi
		Fin Si
	SiNo
		Escribir "Posición inválida."
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