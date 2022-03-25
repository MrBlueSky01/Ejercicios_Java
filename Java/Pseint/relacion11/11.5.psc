Algoritmo sin_titulo
	definir letra como caracter
	Escribir "Ingrese una frase"
    Leer frase
	frase<-Minusculas(frase)
	
    
    cantpalabras<-0
    
    // comparar todas las letras de frase con las de vocales y contar coincidencias
    Para i<-1 hasta Longitud(frase) Hacer
        
		Si Subcadena(frase,i,i)= " " Entonces
			
			cantpalabras=cantpalabras+1
			
		FinSi
        
    FinPara
    
    Escribir "las palabras encontradas en la frase: ", cantpalabras+1
FinAlgoritmo
