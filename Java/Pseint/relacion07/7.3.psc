Algoritmo sin_titulo
	Escribir "Vamos a realizar una división, di el primer número";
	Leer a;
	Repetir
		Escribir "Di el segundo número";
		Leer b;
		Si b=0 Entonces
			Escribir "No puede haber un 0 en el divisor";
		Sino
			Escribir "El resultado de " a " entre " b " es igual a " a/b;
		FinSi
	Hasta Que b<>0
FinAlgoritmo
