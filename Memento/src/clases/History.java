package clases;

import java.util.Stack;

/**
 *
 * @author Josue
 */

// Caretaker
public class History {

    private Stack<TextEditorMemento> mementos = new Stack<>();

    public void saveMemento(TextEditorMemento memento) {
        mementos.push(memento);
    }

    public TextEditorMemento undo() {
        if (!mementos.isEmpty() && mementos.size() >= 2) {
            TextEditorMemento memento = mementos.get(mementos.size() - 2);
            return memento;
        }
        return null;
    }
}
