public class Persona {
    String nombre="Brayan"; 
    String dni="";
    int edad;
    char genero;


    public void comer(String alimento) {
        System.out.println(nombre + "comer " + alimento+" y su DNI es:"+dni);
        
    }

    public void estudiar(String curso) {
        System.out.println(nombre+" estudiar el curso de "+curso);
        
    }
}
