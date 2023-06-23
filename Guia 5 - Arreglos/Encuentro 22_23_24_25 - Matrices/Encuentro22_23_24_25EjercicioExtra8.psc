Algoritmo Encuentro22_23_24_25EjercicioExtra8
	
	//Una distribuidora de Nescaf� tiene 4 representantes que viajan por toda la Argentina ofreciendo sus productos.
	//Para tareas administrativas el pa�s est� dividido en cinco zonas:
		//Norte, Sur, Este, Oeste y Centro.
	//Mensualmente almacena sus datos y obtiene distintas estad�sticas sobre el comportamiento de sus representantes en cada zona.
	//Se desea hacer un programa que lea el monto de las ventas de los representantes en cada zona y calcule luego:
		//a) el total de ventas de una zona introducida por teclado
		//b) el total de ventas de un vendedor introducido por teclado en cada una de las zonas
		//c) el total de ventas de todos los representantes.
	
	Definir Matriz, Representantes, Zonas, i, j Como Entero
	Definir Zona Como Caracter
	Representantes = 4
	Zonas = 5
	Dimension Matriz(Representantes, Zonas)
	
	Escribir "Ingrese el monto las ventas:"
	
	Para i = 0 Hasta Representantes - 1 Hacer
		Escribir "Representante ", i+1, ":"
		Para j = 0 Hasta Zonas - 1 Hacer
			Segun j Hacer
				0:
					Zona = "Norte"
				1:
					Zona = "Sur"
				2:
					Zona = "Este"
				3:
					Zona = "Oeste"
				4:
					Zona = "Centro"
				De Otro Modo:
					Zona = "Error"
			Fin Segun
			Escribir "Zona ", Zona, ":"
			Leer Matriz(i,j)
//			Matriz(i,j) = Aleatorio(10, 99)
//			Escribir Sin Saltar Matriz(i,j), " "
		FinPara
//		Escribir ""
	FinPara
	
	InformeFinal(Matriz, Representantes, Zonas)
	
FinAlgoritmo

SubProceso InformeFinal (Matriz Por Referencia, Representantes Por Referencia, Zonas Por Referencia)
	
	Definir i, j, TotalZona, opc, zona, TotalRepresentante, vendedor, TotalVentas Como Entero
	Dimension TotalZona(Zonas)
	Dimension TotalRepresentante(Representantes)
	TotalVentas = 0
	
	Para j = 0 Hasta Zonas - 1 Hacer
		TotalZona(j) = 0
	FinPara
	
	Para i = 0 Hasta Representantes - 1 Hacer
		TotalRepresentante(i) = 0
	FinPara
	
	Para i = 0 Hasta Representantes - 1 Hacer
		Para j = 0 Hasta Zonas - 1 Hacer
			TotalZona(j) = TotalZona(j) + Matriz(i,j)
			TotalRepresentante(i) = TotalRepresentante(i) + Matriz(i,j)
			TotalVentas = TotalVentas + Matriz(i,j)
		FinPara
	FinPara

	Escribir "Eliga una opci�n:"
	Escribir "1.! Total de Ventas por Zona"
	Escribir "2.! Total de Ventas por Representante"
	Escribir "3.! Total de todos los Representantes"
	Escribir "4.! Salir"
	Leer opc
	
	Segun opc Hacer
		1:
			Escribir "Total de Ventas por Zona"
			Escribir "Eliga una Zona:"
			Escribir "1.! Norte"
			Escribir "2.! Sur"
			Escribir "3.! Este"
			Escribir "4.! Oeste"
			Escribir "5.! Centro"
			Escribir "6.! Volver al Men� Principal"
			Leer zona
			Segun zona Hacer
				1:
					Escribir "Norte: ", TotalZona(0)
					InformeFinal(Matriz, Representantes, Zonas)
				2:
					Escribir "Sur: ", TotalZona(1)
					InformeFinal(Matriz, Representantes, Zonas)
				3:
					Escribir "Este: ", TotalZona(2)
					InformeFinal(Matriz, Representantes, Zonas)
				4:
					Escribir "Oeste: ", TotalZona(3)
					InformeFinal(Matriz, Representantes, Zonas)
				5:
					Escribir "Centro: ", TotalZona(4)
					InformeFinal(Matriz, Representantes, Zonas)
				6:
					InformeFinal(Matriz, Representantes, Zonas)
				De Otro Modo:
					Escribir "Eliga una opcion v�lida"
					InformeFinal(Matriz, Representantes, Zonas)
			Fin Segun
		2:
			Escribir "Total de Ventas por Representante"
			Escribir "Eliga una Vendedor:"
			Escribir "1.! Vendedor 1"
			Escribir "2.! Vendedor 2"
			Escribir "3.! Vendedor 3"
			Escribir "4.! Vendedor 4"
			Escribir "5.! Volver al Men� Principal"
			Leer vendedor
			Segun vendedor Hacer
				1:
					Escribir "Vendedor 1: ", TotalRepresentante(0)
					InformeFinal(Matriz, Representantes, Zonas)
				2:
					Escribir "Vendedor 2: ", TotalRepresentante(1)
					InformeFinal(Matriz, Representantes, Zonas)
				3:
					Escribir "Vendedor 3: ", TotalRepresentante(2)
					InformeFinal(Matriz, Representantes, Zonas)
				4:
					Escribir "Vendedor 4: ", TotalRepresentante(3)
					InformeFinal(Matriz, Representantes, Zonas)
				5:
					InformeFinal(Matriz, Representantes, Zonas)
				De Otro Modo:
					Escribir "Eliga una opcion v�lida"
					InformeFinal(Matriz, Representantes, Zonas)
			Fin Segun
		3:
			Escribir "Total Ventas: ", TotalVentas
			InformeFinal(Matriz, Representantes, Zonas)
		4:
			Escribir "Saliendo..."
			Esperar 1 Segundos
			Escribir "Gracias vuelva pronto!"
		De Otro Modo:
			Escribir "Eliga una opcion v�lida:"
			InformeFinal(Matriz, Representantes, Zonas)
	Fin Segun
	
FinSubProceso