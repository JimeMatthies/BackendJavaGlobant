Algoritmo Encuentro8Ejercicio7
	
	//Programar un juego donde la computadora elige un n�mero al azar entre 1 y 10, y a
	//continuaci�n el jugador tiene que adivinarlo. La estructura del programa es la siguiente:
		//1) El programa elige al azar un n�mero n entre 1 y 10.
		//2) El usuario ingresa un n�mero x.
		//3) Si x no es el n�mero exacto, el programa indica si n es m�s grande o m�s peque�o que el n�mero ingresado.
		//4) Repetimos desde 2) hasta que x sea igual a n.
	//El programa tiene que imprimir los mensajes adecuados para informarle al usuario qu� hacer y qu� pas� hasta que adivine el n�mero.
	
	Definir respuesta, n Como Real
	
	respuesta = Aleatorio(1,10)
	
	Repetir
		Escribir "Ingrese un numero"
		Leer n
		
		Si n <> respuesta Entonces
			Si n > respuesta Entonces
				Escribir "EL n�mero que ingresaste es mayor al secreto"
			SiNo
				Escribir "El n�mero que ingresaste es menor al secreto"
			Fin Si
		Fin Si
		
	Mientras Que n <> respuesta
	
	Escribir "Encontraste la respuesta, el n�mero secreto es ", respuesta
	
FinAlgoritmo
