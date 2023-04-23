Algoritmo EstadisticasEdades
	
	Definir edad1, edad2, edad3 Como Entero
	Definir promedio Como Real
	Definir apellido Como Caracter
	Definir iguales, mayorDeEdad Como Logico
	
	Escribir "Ingrese el apellido de la familia y luego las tres edades de los hermanos"
	Leer apellido
	Leer edad1, edad2, edad3
	
	promedio = (edad1 + edad2 + edad3) / 3
	
	Escribir "El promedio de la familia ", apellido, " es ", promedio
	
	Escribir "Edad1 (", edad1, " años) menor al promedio?", edad1 < promedio
	Escribir "Edad1 (", edad1, " años) menor al promedio?", edad1 < promedio
	Escribir "Edad1 (", edad1, " años) menor al promedio?", edad1 < promedio
	
	iguales = (edad1 = edad2) y (edad2 = edad3)
	
	Escribir "Tienen la misma edad?", iguales
	
	mayorDeEdad = (edad1 >= 18) o (edad2 >= 18) o (edad3 >= 18)
	
	Escribir "Alguno es mayor de edad?", mayorDeEdad
	
FinAlgoritmo
