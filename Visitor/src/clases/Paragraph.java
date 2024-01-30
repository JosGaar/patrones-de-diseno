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

    // Lógica específica para párrafos
    public String getContent() {
        return "This is a paragraph.";
    }
}
