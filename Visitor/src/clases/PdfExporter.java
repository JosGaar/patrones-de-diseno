package clases;

/**
 *
 * @author Josue
 */

// ConcreteVisitor
public class PdfExporter implements DocumentVisitor {

    private StringBuilder pdfContent = new StringBuilder();

    @Override
    public void visitParagraph(Paragraph paragraph) {
        pdfContent.append("PDF - ").append(paragraph.getContent()).append("\n");
    }

    @Override
    public void visitImage(Image image) {
        pdfContent.append("PDF - Image: ").append(image.getImageSrc()).append("\n");
    }

    @Override
    public void visitTable(Table table) {
        pdfContent.append("PDF - Table: ").append(table.getTableData()).append("\n");
    }

    public String getPdfContent() {
        return pdfContent.toString();
    }
}
