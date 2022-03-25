Algoritmo sin_titulo
	Definir n1,n2, suma,n_usuario Como Entero
	
	n1=azar(101)
	
	n2=azar(101)
	
	suma=n1+n2
	
	Escribir "Adivina La Suma"
	
	leer n_usuario
	
	Mientras suma<>n_usuario Hacer
		
		Escribir "Adivina La Suma"
		
		leer n_usuario
		
	Fin Mientras
	
	Escribir "Adivinaste!" 
FinAlgoritmo 
