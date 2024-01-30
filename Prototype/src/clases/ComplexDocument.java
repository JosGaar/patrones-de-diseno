package clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josue
 */
// ConcretePrototype - Documento que puede tener contenido complejo
public class ComplexDocument implements IDocument {

    private List<String> paragraphs;

    public ComplexDocument(List<String> paragraphs) {
        this.paragraphs = paragraphs;
    }

    @Override
    public IDocument clone() {
        List<String> clonedParagraphs = new ArrayList<>(this.paragraphs);
        return new ComplexDocument(clonedParagraphs);
    }

    @Override
    public void display() {
        System.out.println("Complex Document:");
        for (String paragraph : this.paragraphs) {
            System.out.println(paragraph);
        }
    }

    public List<String> getParagraphs() {
        return paragraphs;
    }

}
