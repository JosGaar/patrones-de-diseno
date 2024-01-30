package clases;

/**
 *
 * @author Josue
 */

// ConcreteCreator - Word Document Creator
public class WordDocumentCreator implements IDocumentCreator {
    @Override
    public IDocument createDocument() {
        return new WordDocument();
    }
}
