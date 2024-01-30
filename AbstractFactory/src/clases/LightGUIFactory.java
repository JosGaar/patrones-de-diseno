package clases;

/**
 *
 * @author Josue
 */

// ConcreteFactoryA - Fábrica de GUI con estilo claro
public class LightGUIFactory implements IGUIFactory {

    @Override
    public IButton createButton() {
        return new LightButton();
    }

    @Override
    public IWindow createWindow() {
        return new LightWindow();
    }

}
