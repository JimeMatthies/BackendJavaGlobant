Algoritmo Encuentro8Ejercicio7
	
	//Programar un juego donde la computadora elige un número al azar entre 1 y 10, y a
	//continuación el jugador tiene que adivinarlo. La estructura del programa es la siguiente:
		//1) El programa elige al azar un número n entre 1 y 10.
		//2) El usuario ingresa un número x.
		//3) Si x no es el número exacto, el programa indica si n es más grande o más pequeño que el número ingresado.
		//4) Repetimos desde 2) hasta que x sea igual a n.
	//El programa tiene que imprimir los mensajes adecuados para informarle al usuario qué hacer y qué pasó hasta que adivine el número.
	
	Definir respuesta, n Como Real
	
	respuesta = Aleatorio(1,10)
	
	Repetir
		Escribir "Ingrese un numero"
		Leer n
		
		Si n <> respuesta Entonces
			Si n > respuesta Entonces
				Escribir "EL número que ingresaste es mayor al secreto"
			SiNo
				Escribir "El número que ingresaste es menor al secreto"
			Fin Si
		Fin Si
		
	Mientras Que n <> respuesta
	
	Escribir "Encontraste la respuesta, el número secreto es ", respuesta
	
FinAlgoritmo
