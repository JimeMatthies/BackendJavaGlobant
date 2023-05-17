Algoritmo Desafio_Zombie
	
	Definir M, i, j Como Entero
	Definir Muestra, Matriz Como Caracter
	
//	Repetir
//		Escribir "Ingrese la muestra"
//		Leer Muestra
//	Hasta Que Longitud(Muestra) = 9 o Longitud(Muestra) = 16 o Longitud(Muestra) = 39
	Muestra = "CDDACCACCACAAABC"
	M = raiz(Longitud(Muestra))
	
	Dimension Matriz(M,M)
	
	LlenarMatrizConPalabra(Matriz, M, M, Muestra)
	
	Escribir "Matriz de la muestra:"
	ImprimeMatriz(Matriz, M, M)
	DetectarGenZ(Matriz, M)
	
FinAlgoritmo

SubProceso LlenarMatrizconPalabra (Matriz Por Referencia, M, N, Muestra)
	Definir i, j, k Como Entero
	k = 0
	Para i = 0 Hasta M - 1 Hacer
		Para j = 0 Hasta N - 1 Hacer
			Matriz(i,j) = Subcadena(Mayusculas(Muestra), (i+j+k*(M-1)), (i+j+k*(M-1)))
		FinPara
		k = k + 1
	FinPara
FinSubProceso

SubProceso DetectarGenZ (Matriz Por Referencia, M)
	Definir i Como Entero
	Definir Diagonal1, Diagonal2 Como Caracter
	Definir GenZ Como Logico
	Dimension Diagonal1(M), Diagonal2(M)
	GenZ = Verdadero
	
	Para i = 0 Hasta M - 1 Hacer
		Diagonal1(i) = ""
		Diagonal2(i) = ""
	FinPara
	
	Para i = 0 Hasta M - 1 Hacer
		Diagonal1(i) = Diagonal1(i) + Matriz(i,i)
		Diagonal2(i) = Diagonal2(i) + Matriz(i, ((M - 1) -i))
	FinPara
	
	i=0
	Mientras GenZ = Verdadero y i < M - 1 Hacer
		Si diagonal1(i) <> diagonal1(i + 1) Entonces
			GenZ = Falso
		Fin Si
		Si diagonal2(i) <> diagonal2(i + 1) Entonces
			GenZ = Falso
		Fin Si
		i = i + 1
	FinMientras
	
	Si GenZ = Verdadero Entonces
		Escribir "El GenZ se encuentra presente en la muestra"
		Escribir "La primera diagonal contiene:"
		Escribir Sin Saltar "["
		Para i = 0 Hasta M - 1 Hacer
			Si i = M - 1 Entonces
				Escribir Sin Saltar Diagonal1(i)
			SiNo
				Escribir Sin Saltar Diagonal1(i), ","
			FinSi
		FinPara
		Escribir "]"
		Escribir "La segunda diagonal contiene:"
		Escribir Sin Saltar "["
		Para i = 0 Hasta M - 1 Hacer
			Si i = M - 1 Entonces
				Escribir Sin Saltar Diagonal2(i)
			SiNo
				Escribir Sin Saltar Diagonal2(i), ","
			FinSi
		FinPara
		Escribir "]"
	SiNo
		Escribir "El GenZ no se encuentra presente en la Muestra."
		Escribir "La primera diagonal contiene:"
		Escribir Sin Saltar "["
		Para i = 0 Hasta M - 1 Hacer
			Si i = M - 1 Entonces
				Escribir Sin Saltar Diagonal1(i)
			SiNo
				Escribir Sin Saltar Diagonal1(i), ","
			FinSi
		FinPara
		Escribir "]"
		Escribir "La segunda diagonal contiene:"
		Escribir Sin Saltar "["
		Para i = 0 Hasta M - 1 Hacer
			Si i = M - 1 Entonces
				Escribir Sin Saltar Diagonal2(i)
			SiNo
				Escribir Sin Saltar Diagonal2(i), ","
			FinSi
		FinPara
		Escribir "]"
	Fin Si
FinSubProceso

SubProceso ImprimeMatriz (Matriz, M, N)
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