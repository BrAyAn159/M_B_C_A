package tareade10ejercicios;

import java.util.Scanner;

public class automobilesMBCA {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        int i, n;
        double categoria_1, categoria_2, categoria_3, clave, costo;
        double impuesto, impuesto_a_pagar;
        categoria_1 = 0;
        categoria_2 = 0;
        categoria_3 = 0;
        impuesto_a_pagar = 0;
        System.out.print("Ingresa el valor de n: ");
        n = lt.nextInt();
        lt.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el valor de clave: ");
            clave = lt.nextDouble();
            lt.nextLine();
            System.out.print("Ingresa el valor de costo: ");
            costo = lt.nextDouble();
            lt.nextLine();
            impuesto=0;
            if(clave==1)
            {
                impuesto=costo*0.1;
                categoria_1=categoria_1+impuesto;
            }
            if(clave==2)
            {
                impuesto=costo*0.07;
                categoria_2=categoria_2+impuesto;
            }
            if(clave==3)
            {
                impuesto=costo*0.05;
                categoria_3=categoria_3+impuesto;
            }
            impuesto_a_pagar=impuesto_a_pagar+impuesto;
            System.out.println("Valor de impuesto: " + impuesto);
            System.out.println();
        }
        System.out.println("Valor de categoria 1: " + categoria_1);
        System.out.println("Valor de categoria 2: " + categoria_2);
        System.out.println("Valor de categoria 3: " + categoria_3);
        System.out.println("Valor de impuesto a pagar: " + impuesto_a_pagar);
    }
}
