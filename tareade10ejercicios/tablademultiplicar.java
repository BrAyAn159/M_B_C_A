package tareade10ejercicios;

import java.util.Scanner;

public class tablademultiplicar {
    public static void main(String[] args) {
 
        Scanner lt = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");                                                         
        n = lt.nextInt();
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=10; i++){
             System.out.println(n + " * " + i + " = " + n*i);                                                     
        }
    }
}
