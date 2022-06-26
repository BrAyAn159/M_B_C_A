package examen;

/**
 * Examen3MBCA
 */
public class Examen3MBCA {

    public static void númerosperfectos() {        
        int numero;
        int resultado;
        int suma=0;
        System.out.println("Introduzca el número a consultar, el siguiente algoritmo le indicará si este es o no un número perfecto");
        numero=lt.nextInt();
        for (int i=1;i<numero;i++){
            resultado =numero%i;
            if (resultado==0){
                suma=suma+i;
            }
        }
        if(suma==numero){
            ;
            System.out.println("El número "+numero+"  es perfecto");
        }else{
            System.out.println("El número "+numero+" no es perfecto");
        }
        }  
}