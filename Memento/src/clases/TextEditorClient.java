package clases;

/**
 *
 * @author Josue
 */
// Client
public class TextEditorClient {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        History history = new History();

        // Edición del texto
        textEditor.appendText("Hola, ");
        history.saveMemento(textEditor.save());

        textEditor.appendText("esto es una ");
        history.saveMemento(textEditor.save());

        textEditor.appendText("demo de Memento.");
        history.saveMemento(textEditor.save());

        // Estado actual del editor
        System.out.println("Contenido actual: " + textEditor.getContent());

        // Deshacer la última acción
        textEditor.restore(history.undo());
        System.out.println("Contenido después de deshacer: " + textEditor.getContent());
    }
}
