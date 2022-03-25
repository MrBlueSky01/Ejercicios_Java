Algoritmo sin_titulo
	acum<-0; acum2<-0
	
	Dimension vector1[3]
	Para i<-1 Hasta 3 Con Paso 1 Hacer
		Escribir "Digite un numero", i;
		Leer num;
		
		vector1[i]<-num
		acum<-acum + vector1[i]		
	FinPara
	
	Dimension vector2[3]
	Para i<-1 Hasta 3 Con Paso 1 Hacer
		Escribir "Digite un numero", i;
		leer num;
		
		vector2[i]<-num
		acum2<-acum2+vector2[i]		
	FinPara
	
	Dimension vector3[2]
	vector3[1]<-acum+acum2
	
	Escribir "Resultado total <- ", vector3[1];
FinAlgoritmo
