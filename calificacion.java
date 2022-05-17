Algoritmo calificacion
	Definir cali Como Entero
	Definir letra Como Caracter
	Escribir "Ingresa una calificacion"
	leer cali
	si cali >=1 y cali <= 10 Entonces
		si cali == 10 Entonces
			letra = "A"
		SiNo
			si cali == 9 Entonces
				letra = "B"
			SiNo
				si cali == 8 Entonces
					letra = "C"
				SiNo
					si cali == 7 o cali == 6 Entonces
						letra = "D"
					SiNo
						letra = "F"
					FinSi
				FinSi
			FinSi
		FinSi
		Escribir "Te corresponde la letra: ",letra
	SiNo
		Escribir  "La calificacion no existe"
	FinSi
	
	
FinAlgoritmo
