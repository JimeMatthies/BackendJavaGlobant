Algoritmo Encuentro5Ejercicio7
	
	//Continuando el ejercicio anterior, ahora se pedir� una frase o palabra y se validara si la
	//primera letra de la frase es igual a la �ltima letra de la frase. Se deber� de imprimir un
	//mensaje por pantalla que diga "CORRECTO", en caso contrario, se deber� imprimir "INCORRECTO".
	
	Definir string Como Caracter
	Escribir "Ingrese una frase o palabra:"
	Leer string
	
	Si Subcadena(string,0,0) = Subcadena(string, Longitud(string)-1, Longitud(string)) Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	FinSi
	
FinAlgoritmo
