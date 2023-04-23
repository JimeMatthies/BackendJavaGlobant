Algoritmo Encuentro12_13_14Ejercicio9
	
	//Los empleados de una fábrica trabajan en dos turnos: Diurno y Nocturno. Se desea calcular el
	//jornal diario de acuerdo con las siguientes reglas:
		//a) La tarifa de las horas diurnas es de $ 90
		//b) La tarifa de las horas nocturnas es de $ 125
		//c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y en
		//un 15% si el turno es nocturno.
	//El programa debe solicitar la siguiente información al usuario: el nombre del trabajador, el día
	//de la semana, el turno (diurno o nocturno) y la cantidad de horas trabajadas. Además,
	//debemos preguntarle al usuario si el día de la semana (lunes, martes, miércoles, etc.) era
	//festivo o no, para poder calcular el jornal diario. Utilice una función para realizar el cálculo.
	
	Definir nombre, dia, turno Como Caracter
	Definir horas, sueldo Como Real
	Definir feriado Como Logico
	
	Escribir "Ingrese el nombre del trabajador:"
	Leer nombre
	Escribir "Que dia de la semana desea calcular:"
	Leer dia
	Escribir "El turno es diurno o nocturno?:"
	Leer turno
	Escribir "Cuantas horas trabajo en este día?"
	Leer horas
	Escribir "El dia fue feriado? (Verdadero/Falso)"
	Leer feriado
	
	sueldo = Pagos(turno, horas, feriado)
	Escribir "El empleado ", Mayusculas(nombre), " en su turno ", Mayusculas(turno), " del dia ", Mayusculas(dia), " (Feriado?: ", feriado, "), en el cual trabajo ", horas, " horas. Se le debe pagar ", sueldo, " pesos."
	
FinAlgoritmo

Funcion retorno <- Pagos (turno Por Referencia, horas Por Referencia, feriado Por Referencia)
	
	Definir retorno, sueldo Como Real
	
	sueldo = 0

	Si Minusculas(turno) = "diurno" Entonces
		Si feriado = Falso Entonces
			sueldo = horas * 90
		SiNo
			sueldo = (horas * 90) * 1.1 
		Fin Si
	SiNo
		Si feriado = Falso Entonces
			sueldo = horas * 125
		SiNo
			sueldo = (horas * 125) * 1.15
		Fin Si
	Fin Si
	
	retorno = sueldo
	
FinFuncion
