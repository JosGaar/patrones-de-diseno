package clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josue
 */

// Client
public class Client {
    public static void main(String[] args) {
        
        // Crear un documento original con contenido complejo
        List<String> originalParagraphs = new ArrayList<>();
        originalParagraphs.add("Paragraph 1");
        originalParagraphs.add("Paragraph 2");
        IDocument originalDocument = new ComplexDocument(originalParagraphs);
        
        // Clonar el documento original
        IDocument clonedDocument = originalDocument.clone();
        
        System.out.println("Contenido del objeto clonado: \n");
        // Mostrar el contenido antes de modificarlo del objeto clonado
        ( (ComplexDocument) clonedDocument).display();
        System.out.println();
        
        // Mostrar el contenido luego de modificarlo
        List<String> clonedParagraphs = ((ComplexDocument) clonedDocument).getParagraphs();
        clonedParagraphs.add("New Paragraph");
        ((ComplexDocument) clonedDocument).display();
        System.out.println();
        
        System.out.println("Contenido del prototipo: \n");
        // Mostrando contenido del prototipo
        ((ComplexDocument) originalDocument).display();
        
    }
}
