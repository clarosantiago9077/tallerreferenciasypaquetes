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
        
        
                libro l4 = null;
        if (l4 != null) {
            l4.mostrarInformacion();
        } else {
            System.out.println("No hay libro");
           
                    
                           // Etapa 4
        l1.setTitulo("");
        System.out.println(l1.getTitulo());
        libro l5 = new libro("", "Anónimo");
        System.out.println(l5.getTitulo());
            
                                   
        }
    }
}


              