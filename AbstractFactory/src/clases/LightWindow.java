package clases;

/**
 *
 * @author Josue
 */

// ConcreteProductA - Ventana con estilo claro
public class LightWindow implements IWindow {
    @Override 
    public void open() {
        System.out.println("Ventana clara abierta");
    }
}
