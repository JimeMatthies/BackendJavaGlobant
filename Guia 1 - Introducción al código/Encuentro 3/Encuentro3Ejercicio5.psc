Algoritmo Encuentro3Ejercicio5
	
	//Un colegio desea saber qu� porcentaje de ni�os y qu� porcentaje de ni�as hay en el curso
	//actual. Dise�ar un algoritmo para este prop�sito. Recuerda que para calcular el porcentaje
	//puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que ingrese la
	//cantidad total de ni�os, y la cantidad total de ni�as que hay en el curso.
	
	Definir boys, girls, boysPorcentaje, girlsPorcentaje Como Real
	
	Escribir "Ingresa la cantidad de ni�os:"
	Leer boys
	
	Escribir "Ingresa la cantidad de ni�as:"
	Leer girls
	
	boysPorcentaje = boys / (boys + girls) * 100
	girlsPorcentaje = girls / (boys + girls) * 100
	
	Escribir "El porcentaje de ni�os es: ", boysPorcentaje, " y el porcentaje de ni�as es: ", girlsPorcentaje
	
	
FinAlgoritmo
