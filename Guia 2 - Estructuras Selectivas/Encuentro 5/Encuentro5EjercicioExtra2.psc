Algoritmo Encuentro5EjercicioExtra2
	
	//Una tienda ofrece para los meses de septiembre, octubre y noviembre un descuento del
	//10% sobre el total de la compra que realiza un cliente. Solicitar al usuario que ingrese un
	//mes y el importe de la compra. El programa debe calcular cuál es el monto total que se
	//debe cobrar al cliente e imprimirlo por pantalla.
	
	Definir mes Como Caracter
	Definir precio Como Entero
	
	Escribir "Ingrese el mes en el cual hizo su compra:"
	Leer mes
	Escribir "Ingrese el precio del producto:"
	Leer precio
	
	mes = Minusculas(mes)
	
	Si mes = "septiembre" o mes = "octubre" o mes = "noviembre" Entonces
		precio = precio * 0.9
		Escribir "Ha obtenido un descuento del 10%. El precio que debe pagar es de: ", precio, " pesos."
	SiNo
		Escribir "El precio que debe pagar es de: ", precio, " pesos."
	FinSi
	
FinAlgoritmo
