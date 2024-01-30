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
        // Lógica para leer un documento de texto
    }

    @Override
    protected void extractText() {
        System.out.println("Extracting text from text document");
        // Lógica para extraer texto de un documento de texto
    }

    @Override
    protected void analyzeText() {
        System.out.println("Analyzing text from text document");
        // Lógica para analizar el texto de un documento de texto
    }
}
