Algoritmo Encuentro15_16Ejercicio6
	
	//Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta entre las
	//letras "M" y "T". Recordar que Pseint le da un valor num�rico a cada letra a trav�s del C�digo
	//Ascii, lo que nos deja usar operadores relacionales con letras y cadenas.
	
	Definir letra Como Caracter
	Escribir "Ingrese una letra:"
	Leer letra
	RevisarLetra(letra)
	
FinAlgoritmo

SubProceso RevisarLetra(letra Por Valor)
	
	Si Mayusculas(letra) > "M" y Mayusculas(letra) < "T"  Entonces
		Escribir "La letra ", Mayusculas(letra), " se encuentra dentro de las letras M y T"
	SiNo
		Escribir "La letra ", Mayusculas(letra), " NO se encuentra dentro de las letras M y T"
	Fin Si
	
FinSubProceso