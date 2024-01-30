package clases;

/**
 *
 * @author Josue
 */

// Invoker
public class Menu {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
