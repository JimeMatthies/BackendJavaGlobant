Algoritmo Encuentro8Ejercicio3
	
	//Realizar un programa que solicite al usuario su código de usuario (un número entero
	//mayor que cero) y su contraseña numérica (otro número entero positivo). El programa no
	//le debe permitir continuar hasta que introduzca como código 1024 y como contraseña
	//4567. El programa finaliza cuando ingresa los datos correctos.
	
	Definir codigoUsuario, clave, codigoIngresado, claveIngresada Como Entero
	
	codigoUsuario = 1024
	clave = 4567
	
	Repetir
		Escribir "Ingrese codigo de usuario:"
		Leer codigoIngresado
		Escribir "Ingrese contraseña numérica:"
		Leer claveIngresada
	Mientras Que codigoIngresado <> codigoUsuario o claveIngresada <> clave
	
	Escribir "Bienvenido"
	
FinAlgoritmo
