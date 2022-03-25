Algoritmo sin_titulo
	numero<-AZAR(101)
	Repetir
		Escribir "Dime el numero"
		leer x
		si x> numero Entonces
			Escribir "Clave incorrecta, el número es menor"
		FinSi
		si x<numero entonces
			escribir "Clave incorrecta, el número es mayor"
		FinSi
	Hasta Que x=numero
	Escribir "Correcto"
FinAlgoritmo
