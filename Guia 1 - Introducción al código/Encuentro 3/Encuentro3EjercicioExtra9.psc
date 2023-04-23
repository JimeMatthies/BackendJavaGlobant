Algoritmo Encuentro3EjercicioExtra9
	
	// Un vendedor recibe un sueldo base más un 10% extra por comisión de sus ventas, el
	//vendedor desea saber cuánto dinero obtendrá por concepto de comisiones por las tres
	//ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta su
	//sueldo base y comisiones.
	
	Definir sueldoBase, venta1, venta2, venta3, ventas, comision, sueldoFinal Como Entero
	
	Escribir "Ingrese su sueldo base:"
	Leer sueldoBase
	Escribir "Ingrese el valor de las tres ventas que hizo:"
	Leer venta1, venta2, venta3
	
	ventas = venta1 + venta2 + venta3
	comision = ventas * 0.1
	sueldoFinal = sueldoBase + comision
	
	Escribir "Su comision por venta son: ", comision, " pesos."
	Escribir "Su sueldo final es de: ", sueldoFinal, " pesos."
	
FinAlgoritmo
