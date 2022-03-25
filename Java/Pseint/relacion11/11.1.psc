Algoritmo sin_titulo
	palabra=""
	palabra2=""
	k<-0
	Escribir "Escribe un nombre"
	Leer palabra
	cantidad=Longitud(palabra)
	Escribir "tamaño", cantidad
	Para i<-1 hasta cantidad Con Paso 1
		palabra2=palabra2+Subcadena(palabra,cantidad-k,cantidad-k);
		k<-k+1
	FinPara
	Escribir palabra2
FinAlgoritmo
