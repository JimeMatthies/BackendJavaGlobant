Algoritmo Encuentro6Guia1Ejercicio3
	
	//Es tu turno, diseña un condicional anidado que le pregunte al usuario si quiere tomar té o café y
	//en caso de que quiera tomar café, preguntar si solo o cortado y en caso de ser cortado, si
	//prefiere leche vegetal.
	
	Definir bebida, cortado, leche Como Caracter
	Escribir "Desea tomar té o café?"
	Leer bebida
	
	Segun Minusculas(bebida) Hacer
		"te":
			Escribir "Aqué está su té!"
		"cafe":
			Escribir "Desea el café solo o cortado?"
			Leer cortado
			Segun Minusculas(cortado) Hacer
				"solo":
					Escribir "Aquí está su café solo!"
				"cortado":
					Escribir "Desea leche animal o vegetal?"
					Leer leche
					Segun Minusculas(leche) Hacer
						"animal":
							Escribir "Aquí está su café cortado con leche animal!"
						"vegetal":
							Escribir "Aquí está su café cortado con leche vegetal!"
						De Otro Modo:
							Escribir "No ha elegido si desea leche vegetal o animal"
					Fin Segun
				De Otro Modo:
					Escribir "No ha elegido su desea su café solo o cortado"
			Fin Segun
		De Otro Modo:
			Escribir "No ha seleccionado té o café"
	Fin Segun
		
FinAlgoritmo
