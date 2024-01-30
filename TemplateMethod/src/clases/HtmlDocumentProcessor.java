package clases;

/**
 *
 * @author Josue
 */

// ConcreteClass (subclase que implementa el procesamiento de documentos HTML)
public class HtmlDocumentProcessor extends IDocumentProcessor {

    @Override
    protected void readDocument() {
        System.out.println("Reading HTML document");
        // Lógica para leer un documento HTML
    }

    @Override
    protected void extractText() {
        System.out.println("Extracting text from HTML document");
        // Lógica para extraer texto de un documento HTML
    }

    @Override
    protected void analyzeText() {
        System.out.println("Analyzing text from HTML document");
        // Lógica para analizar el texto de un documento HTML
    }
}
