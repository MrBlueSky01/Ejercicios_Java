Algoritmo sin_titulo
	Repetir
        Escribir "Dime tu codigo de usuario"
        Leer codigo;
        Si codigo <> 1 Entonces
            Escribir "Codigo incorrecto"
        FinSi
    Hasta Que codigo=1
    Escribir "Bienvenido!"
	Repetir
        Escribir "Dime tu clave de acceso"
        Leer clave;
        Si clave <> 1234 Entonces
            Escribir "Clave incorrecta"
        FinSi
    Hasta Que clave=1234
    Escribir "Bienvenido!"
FinAlgoritmo
