Algoritmo Encuentro12_13_14Ejercicio8
	
	//Crear una función llamada "Login", que recibe un nombre de usuario y una contraseña y que
	//devuelve Verdadero si el nombre de usuario es "usuario1" y si la contraseña es "asdasd".
	//Además, la función calculara el número de intentos que se ha usado para loguearse, tenemos
	//solo 3 intentos, si nos quedamos sin intentos la función devolverá Falso.
	
	Definir usuario, clave Como Caracter
	Escribir "Ingrese nombre de usuario"
	Leer usuario
	Escribir "Ingrese clave"
	Leer clave
	Escribir Login(usuario, clave)
	
FinAlgoritmo

Funcion valido <- Login (usuario Por Referencia, clave Por Referencia)
	
	Definir valido Como Logico
	Definir intentos Como Entero
	
	intentos = 3
	valido = Falso
	
	Mientras intentos > 1 y valido = Falso Hacer
		Si usuario = "usuario1" Entonces
			Si clave = "asdasd" Entonces
				valido = Verdadero
			SiNo
				Escribir "Incorrecto, intente de nuevo"
				intentos = intentos - 1
				Escribir "Le quedan ", intentos, " intentos"
				Escribir "Ingrese nombre de usuario"
				Leer usuario
				Escribir "Ingrese clave"
				Leer clave
			Fin Si
		SiNo
			Escribir "Incorrecto, intente de nuevo"
			intentos = intentos - 1
			Escribir "Le quedan ", intentos, " intentos"
			Escribir "Ingrese nombre de usuario"
			Leer usuario
			Escribir "Ingrese clave"
			Leer clave
		Fin Si
	Fin Mientras
	
	Si valido = Verdadero Entonces
		Escribir "El usuario y la clave es: "
	SiNo
		Escribir "Lo sentimos, el usuario y la clave son: "
	Fin Si
	
Fin Funcion