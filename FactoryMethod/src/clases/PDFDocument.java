package clases;

/**
 *
 * @author Josue
 */

// ConcreteProduct - PDF Document
public class PDFDocument  implements IDocument {
    @Override
    
    public void create() {
        System.out.println("Creando un documento de tipo pdf...");
    }
    
    @Override
    public void escribir() {
        System.out.println("Se esta escribiendo en el documento pdf...");
    }
}
