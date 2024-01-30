package clases;

/**
 *
 * @author Josue
 */

// AbstractClass
public abstract class IDocumentProcessor {

    // M�todo Template Method que define el esqueleto del algoritmo
    public void processDocument() {
        readDocument();
        extractText();
        analyzeText();
        saveResults();
    }

    // M�todos abstractos que deben ser implementados por las subclases
    protected abstract void readDocument();

    protected abstract void extractText();

    protected abstract void analyzeText();

    // M�todo concreto con implementaci�n predeterminada
    protected void saveResults() {
        System.out.println("Results saved to a file");
    }

}
