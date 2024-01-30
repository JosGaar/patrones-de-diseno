package clases;

/**
 *
 * @author Josue
 */

// ConcreteProductB - Boton con estilo oscuro
public class DarkButton implements IButton {
    @Override
    public void click() {
        System.out.println("Boton con estilo oscuro clickeado");
    }
}
