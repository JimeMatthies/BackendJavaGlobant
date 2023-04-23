Algoritmo Encuentro8Ejercicio4
	
	//Se debe realizar un programa que:
		//1) Pida por teclado un número (entero positivo).
		//2) Pregunte al usuario si desea introducir o no otro número.
		//3) Repita los pasos 1o y 2o mientras que el usuario no responda n/N (no).
	//4) Muestre por pantalla la suma de los números introducidos por el usuario.
	
	Definir num, suma Como Entero
	Definir continuar Como Caracter
	
	suma = 0
	
	Repetir
		
		Repetir
			Escribir "Ingrese un numero entero positivo"
			Leer num
		Mientras Que num < 0
		
		suma = suma + num
		
		Repetir
			Escribir "Desea introducir otro numero? (Y/N)?"
			Leer continuar
		Mientras Que Mayusculas(continuar) <> "Y" y Mayusculas(continuar) <> "N"
		
	Mientras Que Mayusculas(continuar) <> "N"
	
	Escribir "La suma de los numeros es ", suma
	
FinAlgoritmo
