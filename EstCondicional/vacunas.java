Algoritmo vacunas
	definir edad,sexo como entero
	definir vacuna como caracter
	Escribir "ingrese la edad"
	Leer edad
	Si edad > 70 Entonces
		vacuna = "C"
	SiNo
		Si edad < 16 Entonces
			vacuna = "A"
		SiNo
			Escribir "ingrese el sexo: 1= mujer o 2 = hombre"
			Leer sexo
			Si sexo == 1 Entonces
				vacuna = "B"
			SiNo
				Si sexo == 2 Entonces
					vacuna = "A"
				SiNo
					Escribir "ingrese un sexo correcto"
				FinSi
			FinSi
		FinSi
	FinSi
	Escribir " se corresponde la vacuna ",vacuna
FinAlgoritmo
