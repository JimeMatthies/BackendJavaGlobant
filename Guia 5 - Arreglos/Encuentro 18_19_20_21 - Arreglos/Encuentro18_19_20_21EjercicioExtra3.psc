Algoritmo Encuentro18_19_20_21EjercicioExtra3
	
	//Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
	//almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector se
	//debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la función
	//Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su longitud.
	
	Definir VectorA Como Caracter
	Definir VectorB, largo, i Como Entero
	
	Escribir "Ingrese el tamaño del vector:"
	Leer largo
	Dimension VectorA(largo), VectorB(largo)
	
	
	Para i = 0 Hasta largo - 1 Hacer
		Escribir "Ingrese nombre de personas"
		Leer VectorA(i)
		VectorB(i) = Longitud(VectorA(i))
	Fin Para
	
	Escribir "Nombres y sus longitudes:"
	Escribir Sin Saltar "["
	Para i = 0 Hasta largo - 1 Hacer
		Si i = largo - 1 Entonces
			Escribir Sin Saltar VectorA(i),": ", VectorB(i)
		SiNo
			Escribir Sin Saltar VectorA(i),": ", VectorB(i), ", "
		Fin Si
	Fin Para
	Escribir "]"
	
FinAlgoritmo
