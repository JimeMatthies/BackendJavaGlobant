Algoritmo Encuentro18_19_20_21Ejercicio4
	
	//Realizar un programa con el siguiente men� y le pregunte al usuario que quiere hacer hasta
	//que ingrese la opci�n Salir:
		//A. 	Llenar Vector A. Este vector es de tama�o N y se debe llenar de manera aleatoria usando la funci�n Aleatorio(valorMin, valorMax) de PseInt.
		//B. 	Llenar Vector B. Este vector tambi�n es de tama�o N y se llena de manera aleatoria.
		//C. 	Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento a elemento. Ejemplo: C = A + B
		//D. 	Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a elemento. Ejemplo: C = B - A
		//E. 	Mostrar. Esta opci�n debe permitir al usuario decidir qu� vector quiere mostrar: Vector A, B, o C.
		//F. 	Salir.
	//NOTA: El rango de los n�meros aleatorios para los Vectores ser� de [-100 a 100]. La longitud
	//para todos los vectores debe ser la misma, por lo tanto, esa informaci�n s�lo se solicitar� una vez.
	
	Definir largo, VectorA, VectorB, VectorC Como Entero
	Escribir "Ingrese el tama�o de los vectores:"
	Leer largo
	Dimension VectorA(largo)
	Dimension VectorB(largo)
	Dimension VectorC(largo)
	menu(largo, VectorA, VectorB, VectorC)
	
FinAlgoritmo

SubProceso menu (largo Por Referencia, VectorA Por Referencia, VectorB Por Referencia, VectorC Por Referencia)
	
	Definir opc Como Caracter
	
	Escribir "Eliga una opci�n:"
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
			menu(largo, VectorA, VectorB, VectorC)
		"B":
			LlenarVector(largo, VectorB)
			menu(largo, VectorA, VectorB, VectorC)
		"C":
			SumarVectores(largo, VectorA, VectorB, VectorC)
			menu(largo, VectorA, VectorB, VectorC)
		"D":
			RestarVectores(largo, VectorA, VectorB, VectorC)
			menu(largo, VectorA, VectorB, VectorC)
		"E":
			MostrarVector(largo, VectorA, VectorB, VectorC)
			menu(largo, VectorA, VectorB, VectorC)
		"F":
			Escribir "Gracias vuelva pronto!"
		De Otro Modo:
			Escribir "Eliga una opcion v�lida:"
			menu(largo, VectorA, VectorB, VectorC)
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

SubProceso RestarVectores(largo Por Referencia, VectorA Por Referencia, VectorB Por Referencia, VectorC Por Referencia)
	Definir i Como Entero
	Para i = 0 Hasta largo - 1 Hacer
		VectorC(i) = VectorB(i) - VectorA(i)
	Fin Para
	Escribir "Se ha restado el vector correctamente."
FinSubProceso

SubProceso MostrarVector (largo Por Referencia, VectorA Por Referencia, VectorB Por Referencia, VectorC Por Referencia)
	Definir i Como Entero
	Definir ver Como Caracter
	
	Escribir "Eliga el Vector que desee mostrar:"
	Escribir "A.! Mostrar Vector A"
	Escribir "B.! Mostrar Vector B"
	Escribir "C.! Mostrar Vector C con la suma de los vectores A y B"
	Escribir "D.! Mostrar Vector C con la resta de los vectores A y B"
	Escribir "E.! Salir"
	Leer ver
	
	Segun Mayusculas(ver) Hacer
		"A":
			Escribir Sin Saltar "["
			Para i=0 Hasta largo - 1 Hacer
				Si i = largo - 1 Entonces
					Escribir Sin Saltar VectorA(i)
				SiNo
					Escribir Sin Saltar VectorA(i), ","
				Fin Si
			Fin Para
			Escribir "]"
			Escribir "Eliga el Vector que desee mostrar:"
			Escribir "1.! Mostrar Vector A"
			Escribir "2.! Mostrar Vector B"
			Escribir "3.! Mostrar Vector C con la suma de los vectores A y B"
			Escribir "4.! Mostrar Vector C con la resta de los vectores A y B"
			Escribir "5.! Salir"
			Leer ver
		"B":
			Escribir Sin Saltar "["
			Para i=0 Hasta largo - 1 Hacer
				Si i = largo - 1 Entonces
					Escribir Sin Saltar VectorB(i)
				SiNo
					Escribir Sin Saltar VectorB(i), ","
				Fin Si
			Fin Para
			Escribir "]"
			Escribir "Eliga el Vector que desee mostrar:"
			Escribir "1.! Mostrar Vector A"
			Escribir "2.! Mostrar Vector B"
			Escribir "3.! Mostrar Vector C con la suma de los vectores A y B"
			Escribir "4.! Mostrar Vector C con la resta de los vectores A y B"
			Escribir "5.! Salir"
			Leer ver
		"C":
			Escribir "La suma de los vectores A y B es:"
			Para i=0 Hasta largo - 1 Hacer
				Escribir VectorA(i), " + ", VectorB(i), " = ", VectorC(i)
			Fin Para
			Escribir "Eliga el Vector que desee mostrar:"
			Escribir "1.! Mostrar Vector A"
			Escribir "2.! Mostrar Vector B"
			Escribir "3.! Mostrar Vector C con la suma de los vectores A y B"
			Escribir "4.! Mostrar Vector C con la resta de los vectores A y B"
			Escribir "5.! Salir"
			Leer ver
		"D":
			Escribir "La resta de los vectores B y A es:"
			Para i=0 Hasta largo - 1 Hacer
				Escribir VectorB(i), " - ", VectorA(i), " = ", VectorC(i)
			Fin Para
			Escribir "Eliga el Vector que desee mostrar:"
			Escribir "1.! Mostrar Vector A"
			Escribir "2.! Mostrar Vector B"
			Escribir "3.! Mostrar Vector C con la suma de los vectores A y B"
			Escribir "4.! Mostrar Vector C con la resta de los vectores A y B"
			Escribir "5.! Salir"
			Leer ver
		"E":
			Escribir "Gracias vuelva pronto!"
		De Otro Modo:
			Escribir "Eliga una opcion v�lida:"
			Escribir "1.! Mostrar Vector A"
			Escribir "2.! Mostrar Vector B"
			Escribir "3.! Mostrar Vector C con la suma de los vectores A y B"
			Escribir "4.! Mostrar Vector C con la resta de los vectores A y B"
			Escribir "5.! Salir"
			Leer ver
	Fin Segun
	
FinSubProceso