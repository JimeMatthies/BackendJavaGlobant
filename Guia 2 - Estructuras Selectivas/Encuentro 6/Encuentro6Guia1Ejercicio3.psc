Algoritmo Encuentro6Guia1Ejercicio3
	
	//Es tu turno, dise�a un condicional anidado que le pregunte al usuario si quiere tomar t� o caf� y
	//en caso de que quiera tomar caf�, preguntar si solo o cortado y en caso de ser cortado, si
	//prefiere leche vegetal.
	
	Definir bebida, cortado, leche Como Caracter
	Escribir "Desea tomar t� o caf�?"
	Leer bebida
	
	Segun Minusculas(bebida) Hacer
		"te":
			Escribir "Aqu� est� su t�!"
		"cafe":
			Escribir "Desea el caf� solo o cortado?"
			Leer cortado
			Segun Minusculas(cortado) Hacer
				"solo":
					Escribir "Aqu� est� su caf� solo!"
				"cortado":
					Escribir "Desea leche animal o vegetal?"
					Leer leche
					Segun Minusculas(leche) Hacer
						"animal":
							Escribir "Aqu� est� su caf� cortado con leche animal!"
						"vegetal":
							Escribir "Aqu� est� su caf� cortado con leche vegetal!"
						De Otro Modo:
							Escribir "No ha elegido si desea leche vegetal o animal"
					Fin Segun
				De Otro Modo:
					Escribir "No ha elegido su desea su caf� solo o cortado"
			Fin Segun
		De Otro Modo:
			Escribir "No ha seleccionado t� o caf�"
	Fin Segun
		
FinAlgoritmo
