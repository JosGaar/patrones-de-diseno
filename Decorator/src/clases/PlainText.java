package clases;

/**
 *
 * @author Josue
 */

// ConcreteComponent
public class PlainText implements IText {

    private String content;

    public PlainText(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
