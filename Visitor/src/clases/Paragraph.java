package clases;

/**
 *
 * @author Josue
 */

// ConcreteElement
public class Paragraph implements DocumentElement {

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visitParagraph(this);
    }

    // L�gica espec�fica para p�rrafos
    public String getContent() {
        return "This is a paragraph.";
    }
}
