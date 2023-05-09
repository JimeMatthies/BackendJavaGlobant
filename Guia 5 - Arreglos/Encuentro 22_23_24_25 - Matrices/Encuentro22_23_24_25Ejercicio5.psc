Algoritmo Encuentro22_23_24_25Ejercicio5
	
	//Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
	//encontrando la manera de que la frase se muestre de manera continua en la matriz.
	//Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así:
		//	H A B
		//	I L I
		//	D A D
	//Nota: recordar el uso de la función Subcadena().
	
	Definir matriz, palabra Como Caracter
	Dimension matriz(3,3)
	
	Repetir
		Escribir "Ingrese una palabra de 9 letras"
		Leer palabra
	Mientras Que Longitud(palabra) <> 9
	
	LlenarMatrizConPalabra(matriz, 3, 3, palabra)
	Escribir "Matriz:"
	ImprimirMatriz(matriz, 3, 3)
	
FinAlgoritmo

SubProceso LlenarMatrizconPalabra (Matriz Por Referencia, M, N, palabra)
	Definir i, j, k Como Entero
	k = 0
	Para i = 0 Hasta M - 1 Hacer
		Para j = 0 Hasta N - 1 Hacer
			Matriz(i,j) = Subcadena(Mayusculas(palabra), (i+j+k*2), (i+j+k*2))
		FinPara
		k = k + 1
	FinPara
FinSubProceso

SubProceso ImprimirMatriz (Matriz, M, N)
	Definir i, j Como Entero
	Para i = 0 Hasta M - 1 Hacer
		Escribir Sin Saltar "["
		Para j = 0 Hasta N - 1 Hacer
			Si j = N - 1 Entonces
				Escribir Sin Saltar Matriz(i,j)
			SiNo
				Escribir Sin Saltar Matriz(i,j), ","
			FinSi
		FinPara
		Escribir "]"
	FinPara
FinSubProceso