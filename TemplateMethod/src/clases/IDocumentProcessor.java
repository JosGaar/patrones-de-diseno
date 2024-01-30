package clases;

/**
 *
 * @author Josue
 */

// AbstractClass
public abstract class IDocumentProcessor {

    // Método Template Method que define el esqueleto del algoritmo
    public void processDocument() {
        readDocument();
        extractText();
        analyzeText();
        saveResults();
    }

    // Métodos abstractos que deben ser implementados por las subclases
    protected abstract void readDocument();

    protected abstract void extractText();

    protected abstract void analyzeText();

    // Método concreto con implementación predeterminada
    protected void saveResults() {
        System.out.println("Results saved to a file");
    }

}
