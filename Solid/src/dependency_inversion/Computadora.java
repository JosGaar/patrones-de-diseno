package dependency_inversion;

/**
 *
 * @author Josue
 */

// Modulo de alto nivel
public class Computadora {
    
    // Se implementa el principio de inversion de dependencias. 
    private ITeclado teclado;
    private IMouse mouse;
    
    // Ademas se cumple el princpio de open/closed
    public Computadora(ITeclado teclado, IMouse mouse) {
        this.teclado = teclado;
        this.mouse = mouse;
    }
    
    public void encender() {
        this.teclado.conectar();
        this.mouse.conectar();
    }
    
}
