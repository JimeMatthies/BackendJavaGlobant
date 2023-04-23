Algoritmo Encuentro3Ejercicio5
	
	//Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el curso
	//actual. Diseñar un algoritmo para este propósito. Recuerda que para calcular el porcentaje
	//puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que ingrese la
	//cantidad total de niños, y la cantidad total de niñas que hay en el curso.
	
	Definir boys, girls, boysPorcentaje, girlsPorcentaje Como Real
	
	Escribir "Ingresa la cantidad de niños:"
	Leer boys
	
	Escribir "Ingresa la cantidad de niñas:"
	Leer girls
	
	boysPorcentaje = boys / (boys + girls) * 100
	girlsPorcentaje = girls / (boys + girls) * 100
	
	Escribir "El porcentaje de niños es: ", boysPorcentaje, " y el porcentaje de niñas es: ", girlsPorcentaje
	
	
FinAlgoritmo
