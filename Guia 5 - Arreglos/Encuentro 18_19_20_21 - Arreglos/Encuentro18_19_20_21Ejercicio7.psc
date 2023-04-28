Algoritmo Encuentro18_19_20_21Ejercicio7
	
	//Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios. Después,
	//hacer una función que reciba los dos arreglos y diga si todos sus valores son iguales o no. La
	//función debe devolver el resultado de está validación, para mostrar el mensaje en el
	//algoritmo. Nota: recordar el uso de las variables de tipo lógico.
	
	Definir largo, VectorA, VectorB Como Entero
	
	Escribir "Ingrese el tamaño de los vectores:"
	Leer largo
	Dimension VectorA(largo)
	Dimension VectorB(largo)
	LlenarVector(largo, VectorA)
	LlenarVector(largo, VectorB)
	Escribir "Son los valores de los vectores iguales?"
	Escribir NumerosIdenticos(VectorA, VectorB, largo)
	
FinAlgoritmo

SubProceso LlenarVector (largo Por Referencia, Vector Por Referencia)
	Definir i Como Entero
	Para i = 0 Hasta largo - 1 Hacer
		Vector(i) = Aleatorio(-100, 100)
	Fin Para
	Escribir "Se ha llenado el vector correctamente."
FinSubProceso

Funcion iguales = NumerosIdenticos(VectorA Por Referencia, VectorB Por Referencia, largo Por Referencia)
	Definir i, aux Como Entero
	Definir igualesA, igualesB, iguales Como Logico
	igualesA = Falso
	igualesB = Falso
	Para i = 0 Hasta largo - 1 Hacer
		Si i = 0 Entonces
			aux = VectorA(i)
		SiNo
			Si aux = VectorA(i) Entonces
				igualesA = Verdadero
			SiNo
				igualesA = Falso
			Fin Si
		Fin Si
	Fin Para
	
	Para i = 0 Hasta largo - 1 Hacer
		Si i = 0 Entonces
			aux = VectorB(i)
		SiNo
			Si aux = VectorB(i) Entonces
				igualesB = Verdadero
			SiNo
				igualesB = Falso
			Fin Si
		Fin Si
	Fin Para
	
	Si igualesA = Verdadero y igualesB = Verdadero Entonces
		iguales = Verdadero
	SiNo
		iguales = Falso
	Fin Si
FinFuncion
	