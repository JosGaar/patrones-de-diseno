package clases;

/**
 *
 * @author Josue
 */

// Originator
public class TextEditor {

    private StringBuilder content;

    public TextEditor() {
        this.content = new StringBuilder();
    }

    public void appendText(String text) {
        content.append(text);
    }

    public String getContent() {
        return content.toString();
    }

    public TextEditorMemento save() {
        return new TextEditorMemento(content.toString());
    }

    public void restore(TextEditorMemento memento) {
        this.content = new StringBuilder(memento.getState());
    }
}
