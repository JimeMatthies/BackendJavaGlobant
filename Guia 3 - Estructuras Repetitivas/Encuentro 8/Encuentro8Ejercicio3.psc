Algoritmo Encuentro8Ejercicio3
	
	//Realizar un programa que solicite al usuario su c�digo de usuario (un n�mero entero
	//mayor que cero) y su contrase�a num�rica (otro n�mero entero positivo). El programa no
	//le debe permitir continuar hasta que introduzca como c�digo 1024 y como contrase�a
	//4567. El programa finaliza cuando ingresa los datos correctos.
	
	Definir codigoUsuario, clave, codigoIngresado, claveIngresada Como Entero
	
	codigoUsuario = 1024
	clave = 4567
	
	Repetir
		Escribir "Ingrese codigo de usuario:"
		Leer codigoIngresado
		Escribir "Ingrese contrase�a num�rica:"
		Leer claveIngresada
	Mientras Que codigoIngresado <> codigoUsuario o claveIngresada <> clave
	
	Escribir "Bienvenido"
	
FinAlgoritmo
