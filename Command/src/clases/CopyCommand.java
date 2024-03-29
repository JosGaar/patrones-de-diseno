package clases;

/**
 *
 * @author Josue
 */

// ConcreteCommand
public class CopyCommand implements Command {
    private TextEditor textEditor;

    public CopyCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.copy();
    }
}
