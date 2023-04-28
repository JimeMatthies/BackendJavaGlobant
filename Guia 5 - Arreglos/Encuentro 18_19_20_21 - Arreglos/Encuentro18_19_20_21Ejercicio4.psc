Algoritmo Encuentro18_19_20_21Ejercicio4
	
	//Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer hasta
	//que ingrese la opción Salir:
		//A. 	Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera aleatoria usando la función Aleatorio(valorMin, valorMax) de PseInt.
		//B. 	Llenar Vector B. Este vector también es de tamaño N y se llena de manera aleatoria.
		//C. 	Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento a elemento. Ejemplo: C = A + B
		//D. 	Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a elemento. Ejemplo: C = B - A
		//E. 	Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar: Vector A, B, o C.
		//F. 	Salir.
	//NOTA: El rango de los números aleatorios para los Vectores será de [-100 a 100]. La longitud
	//para todos los vectores debe ser la misma, por lo tanto, esa información sólo se solicitará una vez.
	
	Definir largo, VectorA, VectorB, VectorC, VectorD Como Entero
	Escribir "Ingrese el tamaño de los vectores:"
	Leer largo
	Dimension VectorA(largo), VectorB(largo), VectorC(largo), VectorD(largo)
	menu(largo, VectorA, VectorB, VectorC, VectorD)
	
FinAlgoritmo

SubProceso menu (largo Por Referencia, VectorA Por Referencia, VectorB Por Referencia, VectorC Por Referencia, VectorD Por Referencia)
	
	Definir opc Como Caracter
	
	Escribir "Eliga una opción:"
	Escribir "A.! Llenar Vector A"
	Escribir "B.! Llenar Vector B"
	Escribir "C.! Llenar Vector C con la suma de los vectores A y B"
	Escribir "D.! Llenar Vector C con la resta de los vectores B y A"
	Escribir "E.! Mostrar"
	Escribir "F.! Salir"
	Leer opc
	
	Segun Mayusculas(opc) Hacer
		"A":
			LlenarVector(largo, VectorA)
			menu(largo, VectorA, VectorB, VectorC, VectorD)
		"B":
			LlenarVector(largo, VectorB)
			menu(largo, VectorA, VectorB, VectorC, VectorD)
		"C":
			SumarVectores(largo, VectorA, VectorB, VectorC)
			menu(largo, VectorA, VectorB, VectorC, VectorD)
		"D":
			RestarVectores(largo, VectorA, VectorB, VectorD)
			menu(largo, VectorA, VectorB, VectorC, VectorD)
		"E":
			MostrarVector(largo, VectorA, VectorB, VectorC, VectorD)
		"F":
			Escribir "Gracias vuelva pronto!"
		De Otro Modo:
			Escribir "Eliga una opcion válida:"
			menu(largo, VectorA, VectorB, VectorC, VectorD)
	Fin Segun
	
FinSubProceso

SubProceso LlenarVector (largo Por Referencia, Vector Por Referencia)
	Definir i Como Entero
	Para i = 0 Hasta largo - 1 Hacer
		Vector(i) = Aleatorio(-100, 100)
	Fin Para
	Escribir "Se ha llenado el vector correctamente."
FinSubProceso

SubProceso SumarVectores(largo Por Referencia, VectorA Por Referencia, VectorB Por Referencia, VectorC Por Referencia)
	Definir i Como Entero
	Para i = 0 Hasta largo - 1 Hacer
		VectorC(i) = VectorA(i) + VectorB(i)
	Fin Para
	Escribir "Se ha sumado el vector correctamente."
FinSubProceso

SubProceso RestarVectores(largo Por Referencia, VectorA Por Referencia, VectorB Por Referencia, VectorD Por Referencia)
	Definir i Como Entero
	Para i = 0 Hasta largo - 1 Hacer
		VectorD(i) = VectorB(i) - VectorA(i)
	Fin Para
	Escribir "Se ha restado el vector correctamente."
FinSubProceso

SubProceso MostrarVector (largo Por Referencia, VectorA Por Referencia, VectorB Por Referencia, VectorC Por Referencia, VectorD Por Referencia)
	Definir i Como Entero
	Definir ver Como Caracter
	
	Escribir "Eliga el Vector que desee mostrar:"
	Escribir "A.! Mostrar Vector A"
	Escribir "B.! Mostrar Vector B"
	Escribir "C.! Mostrar Vector C con la suma de los vectores A y B"
	Escribir "D.! Mostrar Vector C con la resta de los vectores A y B"
	Escribir "E.! Volver al menu principal"
	Escribir "F.! Salir"
	Leer ver
	
	Segun Mayusculas(ver) Hacer
		"A":
			Escribir "Vector A:"
			Escribir Sin Saltar "["
			Para i=0 Hasta largo - 1 Hacer
				Si i = largo - 1 Entonces
					Escribir Sin Saltar VectorA(i)
				SiNo
					Escribir Sin Saltar VectorA(i), ","
				Fin Si
			Fin Para
			Escribir "]"
			MostrarVector(largo, VectorA, VectorB, VectorC, VectorD)
		"B":
			Escribir "Vector B:"
			Escribir Sin Saltar "["
			Para i=0 Hasta largo - 1 Hacer
				Si i = largo - 1 Entonces
					Escribir Sin Saltar VectorB(i)
				SiNo
					Escribir Sin Saltar VectorB(i), ","
				Fin Si
			Fin Para
			Escribir "]"
			MostrarVector(largo, VectorA, VectorB, VectorC, VectorD)
		"C":
			Escribir "La suma de los vectores A y B es:"
			Para i=0 Hasta largo - 1 Hacer
				Escribir VectorA(i), " + ", VectorB(i), " = ", VectorC(i)
			Fin Para
			Escribir "Vector C (suma):"
			Escribir Sin Saltar "["
			Para i=0 Hasta largo - 1 Hacer
				Si i = largo - 1 Entonces
					Escribir Sin Saltar VectorC(i)
				SiNo
					Escribir Sin Saltar VectorC(i), ","
				Fin Si
			Fin Para
			Escribir "]"
			MostrarVector(largo, VectorA, VectorB, VectorC, VectorD)
		"D":
			Escribir "La resta de los vectores B y A es:"
			Para i=0 Hasta largo - 1 Hacer
				Escribir VectorB(i), " - ", VectorA(i), " = ", VectorD(i)
			Fin Para
			Escribir "Vector C (resta):"
			Escribir Sin Saltar "["
			Para i=0 Hasta largo - 1 Hacer
				Si i = largo - 1 Entonces
					Escribir Sin Saltar VectorD(i)
				SiNo
					Escribir Sin Saltar VectorD(i), ","
				Fin Si
			Fin Para
			Escribir "]"
			MostrarVector(largo, VectorA, VectorB, VectorC, VectorD)
		"E":
			menu(largo, VectorA, VectorB, VectorC, VectorD)
		"F":
			Escribir "Gracias vuelva pronto!"
		De Otro Modo:
			Escribir "Eliga una opcion válida:"
			MostrarVector(largo, VectorA, VectorB, VectorC, VectorD)
	Fin Segun
	
FinSubProceso