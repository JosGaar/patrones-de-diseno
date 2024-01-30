package clases;

/**
 *
 * @author Josue
 */

// Decorator
public abstract class TextDecorator implements IText {

    private IText text;

    public TextDecorator(IText text) {
        this.text = text;
    }

    @Override
    public String getContent() {
        return text.getContent();
    }
}
