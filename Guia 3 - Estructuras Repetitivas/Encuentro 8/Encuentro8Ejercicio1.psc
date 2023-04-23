Algoritmo Encuentro8Ejercicio1
	
	//Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar
	//a clave. Sólo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deberá
	//mostrar un mensaje indicándonos que hemos agotado esos 3 intentos. Si acertamos la
	//clave se deberá mostrar un mensaje que indique que se ha ingresado al sistema correctamente.
	
	Definir clave, claveSecreta Como Caracter
	Definir intentos Como Entero
	
	clave = "eureka"
	intentos = 0
	
	Repetir
		Escribir "Ingrese la clave secreta. Usted tiene ", 3 - intentos, " intentos."
		Leer claveSecreta
		intentos = intentos + 1
	Mientras Que claveSecreta <> clave y intentos < 3
	
	Si claveSecreta = clave Entonces
		Escribir "Ingresaste la clave correcta"
	SiNo
		Escribir "No ingresaste la clave correcta, no tienes mas intentos."
	Fin Si

FinAlgoritmo

