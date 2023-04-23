Algoritmo Encuentro5Ejercicio3
	
	//Realizar un programa que pida introducir solo frases o palabras de 6 caracteres. Si el
	//usuario ingresa una frase o palabra de 6 caracteres se deberá de imprimir un mensaje
	//por pantalla que diga "CORRECTO", en caso contrario, se deberá imprimir
	//"INCORRECTO". Nota: investigar la función Longitud() de PseInt.
	
	Definir string Como Caracter
	Escribir "Ingrese una frase o palabras de 6 caracteres:"
	Leer string
	
	Si Longitud(string) = 6 Entonces
		Escribir "CORRECTO"
	SiNo
		EScribir "INCORRECTO"
	FinSi
	
	
FinAlgoritmo
