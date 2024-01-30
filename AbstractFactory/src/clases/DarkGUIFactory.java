package clases;

/**
 *
 * @author Josue
 */

// ConcreteFactoryB - F�brica de GUI con estilo oscuro
public class DarkGUIFactory implements IGUIFactory {
    
     @Override
    public IButton createButton() {
        return new DarkButton();
    }

    @Override
    public IWindow createWindow() {
        return new DarkWindow();
    }
}
