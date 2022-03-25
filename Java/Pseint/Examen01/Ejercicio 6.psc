Algoritmo sin_titulo
	Definir x, p Como Entero
	Escribir "Dime cuantas preguntas había"
	Leer x
	Escribir "Dime cuantas acertaste"
	Leer p
	Resultado1<-x*(50/100)
	Resultado2<-x*(75/100)
	Resultado3<-x*(90/100)
	Si p<Resultado1 Entonces
		Escribir "Fuera de nivel"
	FinSi
	Si p>=Resultado1 y p<Resultado2 Entonces
		Escribir "Nivel regular"
	FinSi
	Si p>=Resultado2 y p<Resultado3 Entonces
		Escribir "Nivel medio"
	FinSi
	Si p>Resultado3 Entonces
		Escribir "Nivel máximo"
	FinSi
FinAlgoritmo
