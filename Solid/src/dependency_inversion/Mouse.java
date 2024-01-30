package dependency_inversion;

/**
 *
 * @author Josue
 */

// Modulo de bajo nivel
public class Mouse implements IMouse {
    
    @Override
    public void conectar() {
        System.out.println("Conexion Mouse vía USB!");
    }
    
}
