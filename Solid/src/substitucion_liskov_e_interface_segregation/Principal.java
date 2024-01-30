package substitucion_liskov_e_interface_segregation;

/**
 *
 * @author Josue
 */
public class Principal {
    
    public static void main(String[] args) {
        
        // Principio de Liskov y segregacion de interfaces
        Felino yegua = new Jaguar(10, 20f); // El subtipo Jaguar es sustituible por su tipo base.
        yegua.cazar(); // La llegua no es forzada a utilizar el metodo maullar (como si lo fuera si solo se tuviese una interfaz Felino)
        
    }
    
}
