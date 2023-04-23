Algoritmo Encuentro8Ejercicio5
	
	//Hacer un algoritmo para calcular la media de los números pares e impares, sólo se
	//ingresará diez números.
	
	Definir num, i, pares, impares, ip, ii Como Entero
	
	i = 0
	pares = 0
	impares = 0
	ip = 0
	ii = 0
	
	Repetir
		Escribir "Ingrese un numero entero"
		Leer num
		i = i + 1
		
		Si num MOD 2 = 0 Entonces
			pares = pares + num
			ip = ip + 1
		SiNo
			impares = impares + num
			ii = ii + 1
		Fin Si
	Mientras Que i < 10
	
	Si ip = 0 Entonces
		ip = 1
	Fin Si
	
	Si ii = 0 Entonces
		ii = 1
	Fin Si
	
	Escribir "Ya ingresaste 10 números."
	Escribir "El promedio de los numeros pares es " pares / ip
	Escribir "El promedio de los numeros impares es " impares / ii
	
FinAlgoritmo
