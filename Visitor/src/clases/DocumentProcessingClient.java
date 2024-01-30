package clases;

/**
 *
 * @author Josue
 */

// Client
public class DocumentProcessingClient {

    public static void main(String[] args) {
        Document document = new Document();
        document.addElement(new Paragraph());
        document.addElement(new Image());
        document.addElement(new Table());

        HtmlExporter htmlExporter = new HtmlExporter();
        document.export(htmlExporter);
        System.out.println("HTML Content:\n" + htmlExporter.getHtmlContent());

        PdfExporter pdfExporter = new PdfExporter();
        document.export(pdfExporter);
        System.out.println("PDF Content:\n" + pdfExporter.getPdfContent());
    }
}
