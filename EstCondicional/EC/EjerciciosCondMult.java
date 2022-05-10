package EstCondicional.EC;

import java.security.Key;
import java.util.Scanner;

/**
 * EjerciciosCondMult
 */
public class EjerciciosCondMult {
    public static void profesor() {
        System.out.println("La funcion del docente es enseñar");
    }
    public static void estudiante() {
        System.out.println("La funcion del estudiante es apender");
    }
}

public void maquinaPC() {
    System.out.println("La funcion de la PC es es procesar Informacion");
}
public void proyector() {
    System.out.println("Proyectar una imagen, informacion");
}


public void public static void main(String[] args) {
    EjerciciosCondMult objx=new EjerciciosCondMult();
    objx.maquinaPC();
    Scanner lt=new Scanner(System.in);
    System.out.println("Ingrese el algoritmo que desea probar\n1=Profesor"+
    "\n2=Estudiante\n3=Maquina\n4=Proyector");
    int opcMet=lt.nextInt();
    
switch (opcMet) {
    case 1:{profesor(); } break;
    case 2: estudiante();  break;    
    case 3: objx.maquinaPC(); break;   
    case 4: objx.proyector(); break; 

    default: System.err.println("Opcion no existe"); break;
        
}

    



}













