package clases;

/**
 *
 * @author Josue
 */

// Client
public class TextEditorClient {

    public static void main(String[] args) {
        
        TextEditor textEditor = new TextEditor();

        // Crear comandos concretos y configurar el receptor
        Command cutCommand = new CutCommand(textEditor);
        Command copyCommand = new CopyCommand(textEditor);
        Command pasteCommand = new PasteCommand(textEditor);

        // Configurar el invocador con diferentes comandos
        Menu menu = new Menu();
        menu.setCommand(cutCommand);
        menu.executeCommand();

        menu.setCommand(copyCommand);
        menu.executeCommand();

        menu.setCommand(pasteCommand);
        menu.executeCommand();
    }
}
