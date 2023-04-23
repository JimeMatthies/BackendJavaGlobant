Algoritmo Encuentro10Ejercicio1
	
	//Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza
	//m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor
	//recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. El gerente de la
	//compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada
	//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu�nto
	//deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
	//vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por
	//cada venta.
	
	Definir n, i, j, k, sueldoBase, numVentas, precioXventa, comision Como Entero
	
	Repetir
		Escribir "Ingrese cantidad de vendedores:"
		Leer n
	Mientras Que n <= 0
	
	comision = 0
	sueldoBase = 0
	
	Para i = 1 Hasta n Hacer
		Escribir "Ingrese el sueldo base del vendedor:"
		Leer sueldoBase
		
		Para j = 1 Hasta 4 Hacer
			Escribir "Ingrese cuantas ventas realiz� el ", i, "� vendedor en la ", j, "� semana "
			Leer numVentas
			Si numVentas >= 1 Entonces
				Para k = 1 Hasta numVentas Hacer
					Escribir "Ingrese a cuanto cobr� el vendedor por la ", k, "� venta en la ", j, "� semana"
					Leer precioXventa
					comision = comision + precioXventa*0.1
				Fin Para
			Fin Si
		Fin Para
		Escribir "La comision por ventas que le debe pagar al vendedor es de:", comision
		Escribir "El sueldo total que debe pagar al vendedor es de: ", sueldoBase + comision
	Fin Para
	
FinAlgoritmo
