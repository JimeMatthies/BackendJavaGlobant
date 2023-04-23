Algoritmo Encuentro6Ejercicio3
	
	//Escriba un programa para obtener el grado de eficiencia de un operario de una f�brica de
	//tornillos, de acuerdo a las siguientes dos condiciones que se le imponen para un per�odo
	//de prueba:
		//x Producir menos de 200 tornillos defectuosos.
		//x Producir m�s de 10000 tornillos sin defectos.
	//El grado de eficiencia se determina de la siguiente manera:
		//x Si no cumple ninguna de las condiciones, grado 5.
		//x Si s�lo cumple la primera condici�n, grado 6.
		//x Si s�lo cumple la segunda condici�n, grado 7.
		//x Si cumple las dos condiciones, grado 8
	//Nota: para trabajar este ejercicio de manera prolija, ir probando cada inciso
	//que pide el ejercicio. No hacer todos al mismo tiempo y despu�s probar.
	
	Definir tDefectuosos, tPerfectos Como Entero
	Escribir "Ingrese la cantidad de tornillos defectuosos:"
	Leer tDefectuosos
	Escribir "Ingrese la cantidad de tornillos sin defectos:"
	Leer tPerfectos
	
	Si tDefectuosos >= 200 y tPerfectos < 10000 Entonces
		Escribir "Obtuvo Grado 5"
	SiNo
		Si tDefectuosos < 200 y tPerfectos < 10000 Entonces
			Escribir "Obtuvo Grado 6"
		SiNo
			Si tDefectuosos >= 200 y tPerfectos >= 10000 Entonces
				Escribir "Obtuvo Grado 7"
			Sino
				Escribir "Obtuvo Grado 8"
			FinSi
		FinSi
	Fin Si
	
FinAlgoritmo
