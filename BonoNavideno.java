Proceso BonoNavideno
		Escribir Sin Saltar "Ingresa el valor de antiguedad:";
		Leer antiguedad;
		Escribir Sin Saltar "Ingresa el valor de sueldo:";
		Leer sueldo;
		Si antiguedad>4 O sueldo<2000 Entonces
			bono_navideno <- sueldo*0.25;
		SiNo
			bono_navideno <- sueldo*0.2;
		FinSi
		Escribir "Valor de bono navideno: ", bono_navideno;
FinProceso
