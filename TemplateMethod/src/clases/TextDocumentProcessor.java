package clases;

/**
 *
 * @author Josue
 */

// ConcreteClass (subclase que implementa el procesamiento de documentos de texto)
public class TextDocumentProcessor extends IDocumentProcessor {

    @Override
    protected void readDocument() {
        System.out.println("Reading text document");
        // L�gica para leer un documento de texto
    }

    @Override
    protected void extractText() {
        System.out.println("Extracting text from text document");
        // L�gica para extraer texto de un documento de texto
    }

    @Override
    protected void analyzeText() {
        System.out.println("Analyzing text from text document");
        // L�gica para analizar el texto de un documento de texto
    }
}
