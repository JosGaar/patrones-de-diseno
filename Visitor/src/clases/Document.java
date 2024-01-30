package clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josue
 */

// ObjectStructure
public class Document {

    private List<DocumentElement> elements = new ArrayList<>();

    public void addElement(DocumentElement element) {
        elements.add(element);
    }

    public void export(HtmlExporter htmlExporter) {
        for (DocumentElement element : elements) {
            element.accept(htmlExporter);
        }
    }

    public void export(PdfExporter pdfExporter) {
        for (DocumentElement element : elements) {
            element.accept(pdfExporter);
        }
    }
}
