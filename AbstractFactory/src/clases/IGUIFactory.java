package clases;

/**
 *
 * @author Josue
 */

// AbstractFactory
public interface IGUIFactory {
    IButton createButton();
    IWindow createWindow();
}
