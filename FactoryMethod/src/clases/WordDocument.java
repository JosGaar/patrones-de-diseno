package clases;

/**
 *
 * @author Josue
 */

// ConcreteProduct - Word Document
public class WordDocument implements IDocument {
    @Override
    public void create() {
        System.out.println("Creando un documento de tipo word...");
    }
    
    @Override
    public void escribir() {
        System.out.println("Se esta escribiendo en el documento de word...");
    }
}
