Algoritmo Encuentro17Desafio
	
	//Vamos a programar una calculadora de materiales para construir
	//Primero leeremos todo el ejercicio y luego dividiremos tareas en el equipo.
	//El algoritmo principal sólo debe llamar al subPrograma menu()
	//Cada subPrograma puede descomponerse, si hiciera falta, en otros subProgramas a creatividad del programador
	//El menú debe quedar de la siguiente manera:
		//1.! Calcular muro de ladrillo
		//2.! Calcular viga de hormigón
		//3.! Calcular columnas de hormigón
		//4.! Calcular contrapisos
		//5.! Calcular techo
		//6.! Calcular pisos
		//7.! Calcular pintura
		//8.! Calcular iluminación
		//9.! Salir
	
	menu()
	
FinAlgoritmo

SubProceso menu
	
	Definir opc Como Entero
	
	Escribir "Eliga una opción:"
	Escribir "1.! Calcular muro de ladrillo"
	Escribir "2.! Calcular viga de hormigón"
	Escribir "3.! Calcular columnas de hormigón"
	Escribir "4.! Calcular contrapisos"
	Escribir "5.! Calcular techo"
	Escribir "6.! Calcular pisos"
	Escribir "7.! Calcular pintura"
	Escribir "8.! Calcular iluminación"
	Escribir "9.! Salir"
	Leer opc
	
	Segun opc Hacer
		1:
			calcularMuro()
			menu()
		2:
			calcularViga()
			menu()
		3:
			calcularColumna()
			menu()
		4:
			calcularContrapisos()
			menu()
		5:
			calcularTecho()
			menu()
		6:
			calcularPisos()
			menu()
		7:
			calcularPintura()
			menu()
		8:
			calcularIluminacion()
			menu()
		9:
			Escribir "Gracias vuelva pronto!"
		De Otro Modo:
			Escribir "Eliga una opcion válida:"
			menu()
	Fin Segun
	
FinSubProceso

//subprogramas calcularSuperficie y calcularVolumen
//Haremos ambos para usarlos dentro de los otros subprogramas. El usuario no puede acceder a ellos.

Funcion superficie = calcularSuperficie (largo Por Valor, ancho Por Valor)
	
	Definir superficie Como Real
	superficie = largo * ancho
	
FinFuncion


Funcion volumen = calcularVolumen (largo Por Valor, ancho Por Valor, profundidad Por Valor)
	
	Definir volumen Como Real
	volumen = largo * ancho * profundidad
	
FinFuncion

//subprograma calcularMuro
//Nos debe pedir primero si el muro será de 20 o 30 cm de espesor. Luego el largo y el alto. A partir
//de estos datos se debe mostrar al usuario la superficie del muro y la cantidad de materiales que
//necesitaremos para construirlo.
//Si el muro es de 30cm necesitaremos por metro cuadrado: 15.2 kg de cemento, 0.115 m3 de arena y 120 ladrillos.
//Si el muro es de 20cm necesitaremos por metro cuadrado: 10.9 kg de cemento, 0.09 m3 de arena y 90 ladrillos.

SubProceso calcularMuro
	
	Definir espesor, largo, alto, superficie, cemento, arena, ladrillos Como Real

	Repetir
		Escribir "El muro es de 20 cm o 30 cm de espesor?"
		Leer espesor
	Mientras Que espesor <> 20 y espesor <> 30
	
	Escribir "Ingrese el largo del muro:"
	Leer largo
	Escribir "Ingrese el alto del muro:"
	Leer alto
	
	superficie = calcularSuperficie(largo, alto)
	Escribir "La superficie del muro es de:", superficie
		
	Si espesor = 20 Entonces
		cemento = 15.2 * superficie
		arena = 0.115 * superficie
		ladrillos = 120 * superficie
	SiNo
		Si espesor = 30 Entonces
			cemento = 10.9 * superficie
			arena = 0.09 * superficie
			ladrillos = 90 * superficie
		Fin Si
	Fin Si
	
	Escribir "La cantidad de cemento que se necesita es de: ", cemento, " kg."
	Escribir "La cantidad de arena que se necesita es de: ", arena, " m3."
	Escribir "La cantidad de ladrillos que se necesita es de: ", ladrillos, " ladrillos."
	
FinSubProceso

//subprograma calcularViga
//Nos debe pedir el largo de la viga. Por metro lineal de viga se necesitarán: 9 kg de cemento, 0.02
//m3 de arena, 0.02 m2 de piedra, 4 m de hierro del 8 y 3 m de hierro del 4.
//Debemos mostrar al usuario la cantidad de materiales necesaria.

SubProceso calcularViga
	
	Definir largo Como Real
	
	Escribir "Ingrese el largo de su viga:"
	Leer largo
	
	Escribir "La cantidad de cemento que se necesita es de: ", 9 * largo, " kg."
	Escribir "La cantidad de arena que se necesita es de: ", 0.02 * largo, " m3."
	Escribir "La cantidad de piedra que se necesita es de: ", 0.02 * largo, " m2."
	Escribir "La cantidad de hierro 8 que se necesita es de: ", 4 * largo, " m."
	Escribir "La cantidad de hierro 4 se necesita es de: ", 3 * largo, " m."

FinSubProceso

//subprograma calcularColumna
//Nos debe pedir el largo de la columna. Por metro lineal de columna se necesitarán: 7.5 kg de
//cemento, 0.016 m3 de arena, 0.016 m2 de piedra, 6 m de hierro del 10 y 3 m de hierro del 4.
//Debemos mostrar al usuario la cantidad de materiales necesaria.

SubProceso calcularColumna
	
	Definir largo Como Real
	
	Escribir "Ingrese el largo de su columna:"
	Leer largo
	
	Escribir "La cantidad de cemento que se necesita es de: ", 7.5 * largo, " kg."
	Escribir "La cantidad de arena que se necesita es de: ", 0.016 * largo, " m3."
	Escribir "La cantidad de piedra que se necesita es de: ", 0.016 * largo, " m2."
	Escribir "La cantidad de hierro 10 que se necesita es de: ", 6 * largo, " m."
	Escribir "La cantidad de hierro 4 se necesita es de: ", 3 * largo, " m."
	
FinSubProceso

//subprograma calcularContrapisos
//Nos debe pedir espesor, ancho y largo del contrapiso a calcular.
//Por metro cúbico de contrapiso se necesita: 105 kg de cemento, 0.45 m3 de arena y 0.9 m3 de piedra.
//Debemos mostrar al usuario la cantidad de materiales necesaria.

SubProceso calcularContrapisos
	
	Definir espesor, ancho, largo, volumen Como Real
	
	Escribir "Ingrese el espesor del contrapiso:"
	Leer espesor
	Escribir "Ingrese el ancho del contrapiso:"
	Leer ancho
	Escribir "Ingrese el largo del contrapiso:"
	Leer largo
	
	volumen = calcularVolumen(largo, ancho, espesor)
	
	Escribir "La cantidad de cemento que se necesita es de: ", 105 * volumen, " kg."
	Escribir "La cantidad de arena que se necesita es de: ", 0.45 * volumen, " m3."
	Escribir "La cantidad de piedra que se necesita es de: ", 0.9 * volumen, " m2."
	
FinSubProceso

//subprograma calcularTecho
//Nos debe pedir espesor, ancho y largo del techo a calcular.
//Por metro cuadrado de techo se necesita: 33 kg de cemento, 0.072 m3 de arena, 0.072 m3 de
//piedra, 7 m de hierro del 8 y 4 m de hierro del 6
//Debemos mostrar al usuario la cantidad de materiales necesaria.

SubProceso calcularTecho
	
	Definir espesor, ancho, largo, volumen Como Real
	
	Escribir "Ingrese el espesor del techo:"
	Leer espesor
	Escribir "Ingrese el ancho del techo:"
	Leer ancho
	Escribir "Ingrese el largo del techo:"
	Leer largo
	
	volumen = calcularVolumen(largo, ancho, espesor)
	
	Escribir "La cantidad de cemento que se necesita es de: ", 33 * volumen, " kg."
	Escribir "La cantidad de arena que se necesita es de: ", 0.072 * volumen, " m3."
	Escribir "La cantidad de piedra que se necesita es de: ", 0.072 * volumen, " m2."
	Escribir "La cantidad de hierro 8 que se necesita es de: ", 7 * volumen, " m."
	Escribir "La cantidad de hierro 6 se necesita es de: ", 4 * volumen, " m."
	
FinSubProceso

//subprograma calcularPisos
//Nos debe pedir ancho y largo del paño de piso a colocar. Teniendo esos datos se debe calcular la
//superficie y añadirle un 10% extra por recortes
//Mostrar el resultado en m2

SubProceso calcularPisos
	
	Definir ancho, largo, superficie Como Real
	
	Escribir "Ingrese el ancho del paño del piso:"
	Leer ancho
	Escribir "Ingrese el largo del paño del piso:"
	Leer largo
	
	superficie = calcularSuperficie(largo, ancho)
	
	Escribir "La superficie es de: ", superficie * 1.1 , " m2."
	
FinSubProceso

//subprograma calcularPintura
//Nos debe pedir la superficie del muro y mostrar cuánta pintura necesitamos teniendo en cuenta
//que rinde 6 m2 por litro de pintura.

SubProceso calcularPintura
	
	Definir ancho, largo, superficie Como Real
	
	Escribir "Ingrese el ancho del muro:"
	Leer ancho
	Escribir "Ingrese el largo del muro:"
	Leer largo
	
	superficie = calcularSuperficie(largo, ancho)
	
	Escribir "La cantidad de pintura que necesitamos: ", redon(superficie / 6) , " lts."
	
FinSubProceso

//subprograma calcularIluminacion
//Nos debe pedir la superficie de la habitación. La iluminación la calculamos de la siguiente forma:
//superficie * 0.20. Eso nos da la cantidad mínima de superficie de iluminación natural (ventanas y
//puertas de vidrio). Mostrar resultado

SubProceso calcularIluminacion
	
	Definir ancho, largo, superficie Como Real
	
	Escribir "Ingrese el ancho de al habitación:"
	Leer ancho
	Escribir "Ingrese el largo de la habitación:"
	Leer largo
	
	superficie = calcularSuperficie(largo, ancho)
	
	Escribir "La cantidad de iluminación que necesitamos es: ", superficie * 0.20, " iluminación."
	
FinSubProceso