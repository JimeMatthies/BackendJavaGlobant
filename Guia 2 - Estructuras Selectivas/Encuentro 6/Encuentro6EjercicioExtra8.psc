Algoritmo Encuentro6EjercicioExtra8
	
	//Una empresa tiene personal de distintas áreas con distintas condiciones de contratación y
	//formas de pago. El departamento de contabilidad necesita calcular los sueldos semanales
	//(lunes a viernes) en base a las 3 modalidades de sueldo:
		//a) comisión
		//b) salario fijo + comisión, y
		//c) salario fijo
	
	//a) Para la modalidad salario por comisión se debe ingresar el monto total de las ventas
	//realizadas en la semana, y el 40% de ese monto total corresponde al salario del
	//empleado.
	
	//b) Para la condición de salario fijo + comisión, se debe ingresar el valor que se paga por
	//hora, la cantidad de horas trabajadas semanalmente y el monto total de las ventas en
	//esa semana. En este tipo de contrato las horas extras no están contempladas y se fija
	//como máximo 40 horas por semana. La comisión por las ventas se calcula como 25%
	//del valor de venta total.
	
	//c) Finalmente, para la modalidad de salario fijo se debe ingresar el valor que se paga
	//por hora y la cantidad de horas trabajadas en la semana. En el caso de exceder las
	//40 horas semanales, las horas extras se deben pagar con un extra del 50% del valor de la hora.
	//Realizar un menú de opciones para poder elegir el tipo de contrato que tiene un empleado.
	
	Definir modalidad Como Caracter
	Definir ventas, sueldo, pagoXhora, horas, sueldoXhora Como Entero
	Escribir "Ingrese la modalidad de sueldo:"
	Escribir "A - Comisión"
	Escribir "B - Salario Fijo + Comisión"
	Escribir "C - Salario Fijo"
	Leer modalidad
	
	Segun Mayusculas(modalidad) Hacer
		"A":
			Escribir "Modalidad de Sueldo por Comisión"
			Escribir "Ingresa el total de ventas de la semana"
			Leer ventas
			Escribir "Tu sueldo semanal es de ", ventas*0.4
		"B":
			Escribir "Modalidad de Sueldo de Salario Fijo + Comisión"
			Escribir "Ingrese el valor de pago por hora"
			Leer pagoXhora
			Escribir "Ingrese la cantidad de horas trabajadas en la semana"
			Leer horas
			Escribir "Ingresa el total de ventas de la semana"
			Leer ventas
			Si horas >= 40 Entonces
				sueldoXhora = pagoXhora * 40
			SiNo
				sueldoXhora = pagoXhora * horas
			Fin Si
			sueldo = sueldoXhora + ventas * 0.25
			Escribir "Tu sueldo semanal es de ", sueldo
		"C":
			Escribir "Modalidad de Sueldo de Salario Fijo"
			Escribir "Ingrese el valor de pago por hora"
			Leer pagoXhora
			Escribir "Ingrese la cantidad de horas trabajadas en la semana"
			Leer horas
			Si horas >= 40 Entonces
				sueldoXhora = (pagoXhora * 40) + (horas-40)*(pagoXhora*1.5)
			SiNo
				sueldoXhora = pagoXhora * horas
			Fin Si
			Escribir "Tu sueldo semanal es de ", sueldoXhora
		De Otro Modo:
			Escribir "La modalidad de sueldo no es válida."
	Fin Segun

FinAlgoritmo
