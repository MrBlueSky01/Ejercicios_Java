Algoritmo sin_titulo
	Escribir "Dime un día"
	Leer x
	Escribir "Dime un mes"
	Leer p
	Escribir "Dime un año"
	Leer a
	Si x=25 y p=12 Entonces
		Escribir "Es Navidad"
	SiNo
		Escribir "Es el día: " x
	FinSi
	Si  p=1 Entonces
		Escribir "Mes: Enero"
	SiNo
		Si p=2 Entonces
			Escribir "Mes: Febrero"
		SiNo
			Si  p=3 Entonces
				Escribir "Mes: Marzo"
			SiNo
				Si p=4 Entonces
					Escribir "Mes: Abril"
				SiNo
					Si  p=5 Entonces
						Escribir "Mes: Mayo"
					SiNo
						Si p=6 Entonces
							Escribir "Mes: Junio"
						SiNo
							Si  p=7 Entonces
								Escribir "Mes: Julio"
							SiNo
								Si p=8 Entonces
									Escribir "Mes: Agosto"
								SiNo
									Si  p=9 Entonces
										Escribir "Mes: Septiembre"
									SiNo
										Si p=10 Entonces
											Escribir "Mes: Octubre"
										SiNo
											Si  p=11 Entonces
												Escribir "Mes: Noviembre"
											SiNo
												Si p=12 Entonces
													Escribir "Mes: Diciembre"
												FinSi
												
											FinSi
										FinSi
										
									FinSi
								FinSi
								
							FinSi
						FinSi
						
					FinSi
				FinSi
				
			FinSi
		FinSi
		
	FinSi
	Escribir "Es el año: " a
FinAlgoritmo
