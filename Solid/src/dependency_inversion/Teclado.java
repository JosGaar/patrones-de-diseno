package dependency_inversion;

/**
 *
 * @author Josue
 */

// Modulo de bajo nivel
public class Teclado implements ITeclado {
 
    @Override
    public void conectar() {
        System.out.println("Conexion Teclado v�a USB!");
    }
}
