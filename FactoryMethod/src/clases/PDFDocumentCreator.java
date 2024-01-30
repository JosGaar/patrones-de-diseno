package clases;

/**
 *
 * @author Josue
 */

// ConcreteCreator PDF Document Creator
public class PDFDocumentCreator implements IDocumentCreator {
    @Override
    public IDocument createDocument() {
        return new PDFDocument();
    }
}
