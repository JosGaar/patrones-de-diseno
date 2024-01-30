package clases;

/**
 *
 * @author Josue
 */

// ConcreteProductB - Ventana con estilo oscuro
public class DarkWindow implements IWindow {
    @Override
    public void open() {
        System.out.println("Ventana oscura abierta");
    }
}
