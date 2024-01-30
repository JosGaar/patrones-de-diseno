package clases;

/**
 *
 * @author Josue
 */
// ConcreteDecoratorB
public class ItalicTextDecorator extends TextDecorator {

    public ItalicTextDecorator(IText text) {
        super(text);
    }

    @Override
    public String getContent() {
        return "<i>" + super.getContent() + "</i>";
    }
}
