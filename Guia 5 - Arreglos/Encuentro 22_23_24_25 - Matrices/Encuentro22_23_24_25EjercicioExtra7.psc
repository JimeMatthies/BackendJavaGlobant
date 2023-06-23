Algoritmo Encuentro22_23_24_25EjercicioExtra7
	
	//Una empresa de venta de productos por correo desea realizar una estad�stica de las ventas
	//realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5
	//productos en los 5 d�as h�biles de la semana. Se desea conocer:
		//a) Total de ventas por cada d�a de la semana.
		//b) Total de ventas de cada producto a lo largo de la semana.
		//c) El producto m�s vendido en cada d�a de la semana.
		//d) El nombre, el d�a de la semana y la cantidad del producto m�s vendido.
	//El informe final tendr� un formato como el que se muestra a continuaci�n:
	
	//					Lunes Martes Mi�rcoles Jueves Viernes 	Total producto
	//Producto 1
	//Producto 2
	//Producto 3
	//Producto 4
	//Producto 5
	//Total semana
	//Producto m�s vendido
	
	Definir Matriz, Dias, Productos, i, j Como Entero
	Dias = 5
	Productos = 5
	Dimension Matriz(Productos, Dias)
	
	Para i = 0 Hasta Productos - 1 Hacer
		Para j = 0 Hasta Dias - 1 Hacer
			Matriz(i,j) = Aleatorio(1000, 35000)
		FinPara
	FinPara
	
	InformeFinal(Matriz, Productos, Dias)
	
FinAlgoritmo

SubProceso InformeFinal (Matriz, M, N)
	Definir i, j, SumaProducto, SumaDia, TotalVentas, MejorDelDia, NombreDelMejor, MontoDelMejor Como Entero
	Definir DiaDelMejor Como Caracter
	Dimension SumaProducto(M)
	Dimension SumaDia(N)
	Dimension MejorDelDia(M)
	TotalVentas = 0
	NombreDelMejor = 0
	DiaDelMejor = ""
	MontoDelMejor = 0
	
	Para i = 0 Hasta M - 1 Hacer
		SumaProducto(i) = 0
	FinPara
	
	Para j = 0 Hasta N - 1 Hacer
		SumaDia(j) = 0
		MejorDelDia(j) = 0
	FinPara
	
	Escribir "                     | Lunes               | Martes              | Mi�rcoles           | Jueves              | Viernes             | Total del Producto  |"
	Escribir "---------------------|---------------------|---------------------|---------------------|---------------------|---------------------|---------------------|"
	Para i = 0 Hasta M - 1 Hacer
		Escribir Sin Saltar " Producto ", i + 1, "          |"
		Para j = 0 Hasta N - 1 Hacer
			Si Matriz(i,j) < 10000 Entonces
				Escribir Sin Saltar " ", Matriz(i,j), "                |"
			SiNo
				Escribir Sin Saltar " ", Matriz(i,j), "               |"
			FinSi
			SumaProducto(i) = SumaProducto(i) + Matriz(i,j)
			SumaDia(j) = SumaDia(j) + Matriz(i,j)
			TotalVentas = TotalVentas + Matriz(i,j)
			Si Matriz(i,j) > MejorDelDia(j) Entonces
				MejorDelDia(j) = Matriz(i,j)
			FinSi
			
			Si Matriz(i,j) > MontoDelMejor Entonces
				MontoDelMejor = Matriz(i,j)
				NombreDelMejor = i + 1
				Segun j Hacer
					0:
						DiaDelMejor = "Lunes"
					1:
						DiaDelMejor = "Martes"
					2:
						DiaDelMejor = "Mi�rcoles"
					3:
						DiaDelMejor = "Jueves"
					4:
						DiaDelMejor = "Viernes"
					De Otro Modo:
						DiaDelMejor = "Error"
				Fin Segun
			FinSi
		FinPara
		Si SumaProducto(i) < 100000 Entonces
			Escribir " ", SumaProducto(i), "               |"
		SiNo
			Escribir " ", SumaProducto(i), "              |"
		FinSi
	FinPara
	Escribir Sin Saltar " Total Semana        |"
	Para j = 0 Hasta N - 1
		Si SumaDia(j) < 100000 Entonces
			Escribir Sin Saltar " ", SumaDia(j), "               |"
		SiNo
			Escribir Sin Saltar " ", SumaDia(j), "              |"
		FinSi
	FinPara
	Escribir " ", TotalVentas, "              |"
	Escribir Sin Saltar " Producto + Vendido  |"
	Para j = 0 Hasta N - 1
		Escribir Sin Saltar " ", MejorDelDia(j), "               |"
	FinPara
	Escribir ""
	Escribir ""
	Escribir " EL producto mas vendido de la semana fue el Producto ", NombreDelMejor, " el d�a ", DiaDelMejor, " con un total de ", MontoDelMejor
	Escribir ""
FinSubProceso