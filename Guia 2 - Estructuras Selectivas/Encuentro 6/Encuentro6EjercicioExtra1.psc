Algoritmo Encuentro6EjercicioExtra1
	
	//Solicitar al usuario que ingrese un valor entre 1 y 7. EL programa debe mostrar por
	//pantalla un mensaje que indique a qué día de la semana corresponde. Considere que el
	//número 1 corresponde al día "Lunes", y así sucesivamente.
	
	Definir num Como Entero
	Escribir "Ingresa un numero entero del 1 al 7:"
	Leer num
	Segun num Hacer
		1:
			Escribir "Tu dia es el lunes"
		2:
			Escribir "Tu dia es el martes"
		3:
			Escribir "Tu dia es el miércoles"
		4:
			Escribir "Tu dia es el jueves"
		5:
			Escribir "Tu dia es el viernes"
		6:
			Escribir "Tu dia es el sábado"
		7:
			Escribir "Tu dia es el domingo"
		De Otro Modo:
			Escribir "Tu numero no es un numero válido!"
	Fin Segun
	
FinAlgoritmo
