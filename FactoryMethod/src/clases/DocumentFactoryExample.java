package clases;

/**
 *
 * @author Josue
 */

// DocumentFactoryExample Code
public class DocumentFactoryExample {
    public static void main(String[] args) {
        
        IDocumentCreator pdfCreator = new PDFDocumentCreator();
        IDocument pdfDocument = pdfCreator.createDocument();
        pdfDocument.create();
        pdfDocument.escribir();
        
        System.out.println();
        
        IDocumentCreator wordCreator = new WordDocumentCreator();
        IDocument wordDocument = wordCreator.createDocument();
        wordDocument.create();
        wordDocument.escribir();
    }
}

