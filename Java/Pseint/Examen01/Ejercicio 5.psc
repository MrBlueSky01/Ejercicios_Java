Algoritmo sin_titulo
	Definir x,p Como Real
	Escribir "Dime tu sueldo"
	Leer x
	Escribir "Dime tus años de antigüedad"
	Leer p
	Si x<500 y p>=10 Entonces
		Resultado1<-(x*20)/100
		Resultado2<-x+Resultado1
		Escribir "Aumento del salario en un 20%, sueldo actual: " Resultado2
	FinSi
	Si x<500 y p<10 Entonces
		Resultado3<-(x*5)/100
		Resultado4<-x+Resultado3
		Escribir "Aumento del salario en un 20%, sueldo actual: " Resultado4
	FinSi
	Si x>=500 Entonces
		Escribir "Sueldo actual, sin modificaciones: " x
	FinSi
FinAlgoritmo
