package clases;

/**
 *
 * @author Josue
 */

// Visitor
public interface DocumentVisitor {

    void visitParagraph(Paragraph paragraph);

    void visitImage(Image image);

    void visitTable(Table table);
}
