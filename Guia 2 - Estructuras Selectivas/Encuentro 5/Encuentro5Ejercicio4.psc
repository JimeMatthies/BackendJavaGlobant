Algoritmo Encuentro5Ejercicio4
	
	//Realizar un programa que pida una frase o palabra y si la frase o palabra es de 4
	//aracteres de largo, el programa le concatenara un signo de exclamaci�n al final, y si no
	//es de 4 caracteres el programa le concatenara un signo de interrogaci�n al final. El
	//programa mostrar� despu�s la frase final. Nota: investigar la funci�n Longitud() y
	//Concatenar() de PseInt.
	
	Definir string Como Caracter
	
	Escribir "Ingresa una frase o palabra:"
	Leer string
	
	Si Longitud(string) = 4 Entonces
		Escribir Concatenar(string, "!")
	SiNo
		Escribir Concatenar(string, "?")
	FinSi
	
FinAlgoritmo
