package clases;

/**
 *
 * @author Josue
 */

// Client Code
public class GUIApplication {
    private IGUIFactory guiFactory;
    
    public GUIApplication(IGUIFactory guiFactory) {
        this.guiFactory = guiFactory;
    }
    
    public void createUI() {
        IButton button = guiFactory.createButton();
        IWindow window = guiFactory.createWindow();
        
        button.click();
        window.open();
    }
    
    public static void main(String[] args) {
        // Crear una interfaz gráfica con estilo claro
        GUIApplication lightApp = new GUIApplication(new LightGUIFactory());
        lightApp.createUI();
        
        System.out.println();
        
        // Crear una interfaz grafica con estilo oscuro
        GUIApplication darkApp = new GUIApplication(new DarkGUIFactory());
        darkApp.createUI();
    }
}
