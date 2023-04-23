Algoritmo Encuentro7Guia1Ejercicio1
	
	//Diseña un programa que guarde una vocal secreta en una variable, debemos pedirle al usuario
	//e intente adivinar la vocal secreta, e intentará tantas veces como sea necesario hasta que la adivine.
	
	Definir vocalSecreta, vocalUsuario Como Caracter
	
	vocalSecreta = "e"

	Escribir "Intente adivinar la vocal secreta:"
	Leer vocalUsuario
	
	Mientras Minusculas(vocalUsuario) <> Minusculas(vocalSecreta) Hacer
		Escribir "Intente adivinar la vocal secreta:"
		Leer vocalUsuario
	Fin Mientras
	
	Escribir "Felicitaciones, la vocal secreta es ", vocalSecreta
	
FinAlgoritmo
