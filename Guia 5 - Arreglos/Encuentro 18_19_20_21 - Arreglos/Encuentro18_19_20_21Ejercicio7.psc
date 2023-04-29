Algoritmo Encuentro18_19_20_21Ejercicio7
	
	//Crear un subproceso que rellene dos arreglos de tama�o n, con n�meros aleatorios. Despu�s,
	//hacer una funci�n que reciba los dos arreglos y diga si todos sus valores son iguales o no. La
	//funci�n debe devolver el resultado de est� validaci�n, para mostrar el mensaje en el
	//algoritmo. Nota: recordar el uso de las variables de tipo l�gico.
	
	Definir largo, VectorA, VectorB Como Entero
	
	Escribir "Ingrese el tama�o de los vectores:"
	Leer largo
	Dimension VectorA(largo), VectorB(largo)
	LlenarVector(largo, VectorA)
	LlenarVector(largo, VectorB)
	Escribir "Ambos vectores son iguales?"
	Escribir NumerosIdenticos(VectorA, VectorB, largo)
	
FinAlgoritmo

SubProceso LlenarVector (largo Por Referencia, Vector Por Referencia)
	Definir i Como Entero
	Para i = 0 Hasta largo - 1 Hacer
		Vector(i) = Aleatorio(0, 10)
	Fin Para
	Escribir "Vector:"
	Escribir Sin Saltar "["
	Para i=0 Hasta largo - 1 Hacer
		Si i = largo - 1 Entonces
			Escribir Sin Saltar Vector(i)
		SiNo
			Escribir Sin Saltar Vector(i), ","
		Fin Si
	Fin Para
	Escribir "]"
	Escribir "Se ha llenado el vector correctamente."
FinSubProceso

Funcion iguales = NumerosIdenticos(VectorA Por Referencia, VectorB Por Referencia, largo Por Referencia)
	Definir i Como Entero
	Definir iguales Como Logico
	iguales = Verdadero
	Para i = 0 Hasta largo - 1 Hacer
		Si VectorA(i) <> VectorB(i) Entonces
			iguales = Falso
		Fin Si
	Fin Para
FinFuncion
	