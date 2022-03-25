Algoritmo sin_titulo
	vocales="a, e, i, o, u"
	Escribir "Dime tu nombre"
	Leer nombre
	Escribir Mayusculas(nombre)
	Para i<-1 Hasta Longitud(nombre) Con Paso 1 Hacer
		Para j<-1 Hasta Longitud(vocales) Con Paso 1 Hacer
			Si Subcadena(nombre,i,i)=Subcadena(vocales,j,j) Entonces
				cant=cant+1
				Escribir Subcadena(nombre,i,i) Sin Saltar,""
			FinSi
		FinPara
	FinPara
FinAlgoritmo
