Algoritmo Encuentro6EjercicioExtra6
	
	//Una verduler�a ofrece las manzanas con descuento seg�n la siguiente tabla:
		//KILOS COMPRADOS	 DESCUENTO
		//	0-2					 0%
		//	2.01-5				10%
		//	5.01-10				15%
		//	10.01-n				20%
	//Determinar cu�nto pagar� una persona que compre manzanas en esa verduler�a.
	
	Definir kilos Como Real
	Escribir "Ingrese la cantidad de kilos de manzana que llevar�"
	Leer kilos
	
	Si kilos > 0 y kilos <= 2 Entonces
		Escribir "Usted pagar� el 100% del precio."
	SiNo
		Si kilos > 2 y kilos <= 5 Entonces
			Escribir "Usted pagar� el 90% del precio."
		SiNo
			Si kilos > 5 y kilos <= 10 Entonces
				Escribir "Usted pagar� el 85% del precio."
			SiNo
				Escribir "Usted pagar� el 80% del precio."
			Fin Si
		Fin Si
	Fin Si

	
FinAlgoritmo
