package biblioteca.app;

   //import biblioteca.modelo.libro;

import biblioteca.modelo.libro;

public class biblioteca {
    public static void main(String[] args) {
        libro l1 = new libro("Cien años de soledad", "García Márquez");
        l1.mostrarInformacion();
    }
}