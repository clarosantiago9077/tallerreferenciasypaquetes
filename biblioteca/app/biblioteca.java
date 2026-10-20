package biblioteca.app;

   //import biblioteca.modelo.libro;

import biblioteca.modelo.libro;

public class biblioteca {
    public static void main(String[] args) {
        libro l1 = new libro("Cien años de soledad", "García Márquez");
        l1.mostrarInformacion();
                libro l2 = l1;                                                   // alias: mismo objeto
        libro l3 = new libro("Cien años de soledad", "García Márquez");  // objeto distinto

        l2.prestar();

        System.out.println(l1.estaDisponible());
        System.out.println(l3.estaDisponible());
        System.out.println(l1 == l2);
        System.out.println(l1 == l3);
    }
}

