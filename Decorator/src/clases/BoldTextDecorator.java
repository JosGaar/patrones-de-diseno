package clases;

/**
 *
 * @author Josue
 */

// ConcreteDecoratorA
public class BoldTextDecorator extends TextDecorator {

    public BoldTextDecorator(IText text) {
        super(text);
    }

    @Override
    public String getContent() {
        return "<b>" + super.getContent() + "</b>";
    }
}
