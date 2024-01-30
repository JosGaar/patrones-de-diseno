package clases;

/**
 *
 * @author Josue
 */

// ConcreteProductA - Botón con estilo claro
public class LightButton implements IButton {
    @Override
    public void click() {
        System.out.println("Boton con estilo claro clickeado");
    }
}
