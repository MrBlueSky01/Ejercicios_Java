Algoritmo sin_titulo
	Dimension datos[5];
	definir datos, suma como entero;
	definir media como real;
	suma <- 0;
	definir i como entero;
	
	para i <- 1 hasta 5 con paso 1 hacer
		escribir "Escriba un número: ";
		leer datos[i];
	FinPara
	
	Para i <- 1 hasta 5 con paso 1 Hacer
		suma <- suma + datos[i];
	FinPara
	
	Escribir "La suma de los números es: ", suma;
	media <- suma/5;
	escribir "El promedio es: ", media;

FinAlgoritmo
