Algoritmo Encuentro5Ejercicio4
	
	//Realizar un programa que pida una frase o palabra y si la frase o palabra es de 4
	//aracteres de largo, el programa le concatenara un signo de exclamación al final, y si no
	//es de 4 caracteres el programa le concatenara un signo de interrogación al final. El
	//programa mostrará después la frase final. Nota: investigar la función Longitud() y
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
