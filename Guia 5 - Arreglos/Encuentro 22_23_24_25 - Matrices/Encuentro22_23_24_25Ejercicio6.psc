Algoritmo Encuentro22_23_24_25Ejercicio6
	
	//Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que
	//tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual.
	//Por ejemplo:
		//	2	7	6
		//	9	5	1
		//	4	3	8
	//En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un
	//algoritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso de que
	//sea mágica escribir la suma. Además, el programa deberá comprobar que los números
	//introducidos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el tamaño de la
	//matriz que no debe superar orden igual a 10.
	
	Definir M, matriz, i, j Como Entero
	
	Repetir
		Escribir "Ingrese el tamaño de la matriz cuadrada"
		Leer M
	Hasta Que M > 0 Y M < 11
	
	Dimension matriz(M,M)
	
	Para i = 0 Hasta M - 1 Hacer
		Para j = 0 Hasta M - 1 Hacer
			Repetir
				Escribir Sin Saltar "Ingrese el valor del elemento [", i, ",", j, "]"
				Leer matriz(i,j)
			Hasta Que matriz(i,j) > 0 y matriz(i,j) < 10
		FinPara
	FinPara
	
	Escribir "Matriz:"
	ImprimeMatriz(matriz, M, M)
	ComprobarMatrizMagica(matriz, M)
	
FinAlgoritmo

SubProceso ComprobarMatrizMagica (Matriz Por Referencia, M)
	Definir i, j, k, analizador, largo Como Entero
	Definir magica Como Logico
	largo = M + M + 2
	Dimension analizador(largo)
	magica = Verdadero
	k = 0
	
	Para i = 0 Hasta largo - 1 Hacer
		analizador(i) = 0
	FinPara
	
	Para i = 0 Hasta M - 1 Hacer
		Para j = 0 Hasta M - 1 Hacer
			analizador(k) = analizador(k) + Matriz(i,j)
			analizador(k + M) = analizador(k + M) + Matriz(j,i) 
		FinPara
		analizador(largo - 2) = analizador(largo - 2) + Matriz(i,i)
		analizador(largo - 1) = analizador(largo - 1) + Matriz(i, ((M - 1) -i))
		k = k + 1
	FinPara

	i=0
	Mientras magica = Verdadero y i < largo - 2 Hacer
		Si analizador(i) <> analizador(i + 1) Entonces
			magica = Falso
		Fin Si
		i = i + 1
	FinMientras
	
	Si magica = Verdadero Entonces
		Escribir "La matriz es mágica"
		Escribir "La suma de sus filas, columnas y diagonales es:"
		Para i = 0 Hasta largo - 1 Hacer
			Escribir Sin Saltar "[ S"
			Escribir Sin Saltar i + 1
			Escribir Sin Saltar " ]"
		FinPara
		Escribir ""
		Para i = 0 Hasta largo - 1 Hacer
			Escribir Sin Saltar "[ "
			Escribir Sin Saltar analizador(i)
			Escribir Sin Saltar " ]"
		FinPara
	SiNo
		Escribir "La matriz no es mágica."
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