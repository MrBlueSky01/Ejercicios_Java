Algoritmo sin_titulo
	Repetir
		Escribir "Vamos a sumar dos números. Para cerrar el programa has de introducir un 0 en los dos sumandos";
		Escribir "Di el primer número";
		Leer a;
		Escribir "Di el segundo número";
		Si a=0 Entonces
			Escribir "Si escribes un 0 terminarás el programa";
		FinSi
		Leer b;
		Si (a+b)<>0 Entonces
			Escribir "La suma de " a " y " b " es igual a " a+b;
		Sino
			Escribir "Fin del programa";
		FinSi
	Hasta Que a=0 Y b=0;
FinAlgoritmo
