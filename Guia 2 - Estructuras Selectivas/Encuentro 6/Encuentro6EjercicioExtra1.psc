Algoritmo Encuentro6EjercicioExtra1
	
	//Solicitar al usuario que ingrese un valor entre 1 y 7. EL programa debe mostrar por
	//pantalla un mensaje que indique a qu� d�a de la semana corresponde. Considere que el
	//n�mero 1 corresponde al d�a "Lunes", y as� sucesivamente.
	
	Definir num Como Entero
	Escribir "Ingresa un numero entero del 1 al 7:"
	Leer num
	Segun num Hacer
		1:
			Escribir "Tu dia es el lunes"
		2:
			Escribir "Tu dia es el martes"
		3:
			Escribir "Tu dia es el mi�rcoles"
		4:
			Escribir "Tu dia es el jueves"
		5:
			Escribir "Tu dia es el viernes"
		6:
			Escribir "Tu dia es el s�bado"
		7:
			Escribir "Tu dia es el domingo"
		De Otro Modo:
			Escribir "Tu numero no es un numero v�lido!"
	Fin Segun
	
FinAlgoritmo
