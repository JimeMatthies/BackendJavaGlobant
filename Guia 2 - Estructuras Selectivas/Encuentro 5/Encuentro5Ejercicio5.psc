Algoritmo Encuentro5Ejercicio5
	
	//Escriba un programa que pida 3 notas y valide si esas notas están entre 1 y 10. Si están
	//entre esos parámetros se debe poner en verdadero una variable de tipo lógico y si no
	//ponerla en falso. Al final el programa debe decir si las 3 notas son correctas usando la
	//variable de tipo lógico.
	
	Definir nota1, nota2, nota3 Como Real
	Definir notavalida1, notavalida2, notavalida3 Como Logico
	Escribir "Ingrese tres notas:"
	Leer nota1, nota2, nota3
	
	Si 1 <= nota1 y nota1 <= 10 Entonces
		notavalida1 = Verdadero
	SiNo
		notavalida1 = Falso
	FinSi
	
	Si 1 <= nota2 y nota2 <= 10 Entonces
		notavalida2 = Verdadero
	SiNo
		notavalida2 = Falso
	FinSi
	
	Si 1 <= nota3 y nota3 <= 10 Entonces
		notavalida3 = Verdadero
	SiNo
		notavalida3 = Falso
	FinSi
	
	Si notavalida1 = notavalida2 y notavalida2 = notavalida3 y notavalida1 = Verdadero Entonces
		Escribir "Las tres notas son correctas"
	FinSi

FinAlgoritmo
