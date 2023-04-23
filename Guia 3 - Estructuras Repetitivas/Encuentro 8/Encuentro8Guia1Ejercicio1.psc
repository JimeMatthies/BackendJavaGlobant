Algoritmo Encuentro8Guia1Ejercicio1
	
	//Vamos a hacer nuevamente el ejercicio de la vocal misteriosa, pero esta vez con una estructura
	//Hacer-Mientras. ¿Puedes notar cuál es la diferencia entre ambas estructuras?
	
	Definir vocalSecreta, vocalUsuario Como Caracter
	
	vocalSecreta = "e"
	
	Repetir
		Escribir "Intente adivinar la vocal secreta:"
		Leer vocalUsuario
	Mientras Que Minusculas(vocalUsuario) <> Minusculas(vocalSecreta)
	
	Escribir "Felicitaciones, la vocal secreta es ", vocalSecreta
	
FinAlgoritmo
