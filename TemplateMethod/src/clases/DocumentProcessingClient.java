package clases;

/**
 *
 * @author Josue
 */

// Client
public class DocumentProcessingClient {

    public static void main(String[] args) {
        // Cliente utiliza el Template Method para procesar un documento de texto
        IDocumentProcessor textDocumentProcessor = new TextDocumentProcessor();
        textDocumentProcessor.processDocument();

        System.out.println();

        // Cliente utiliza el Template Method para procesar un documento HTML
        IDocumentProcessor htmlDocumentProcessor = new HtmlDocumentProcessor();
        htmlDocumentProcessor.processDocument();
    }
}
 