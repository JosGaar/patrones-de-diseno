package clases;

/**
 *
 * @author Josue
 */

// ConcreteElement
public class Image implements DocumentElement {

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visitImage(this);
    }

    // Lógica específica para imágenes
    public String getImageSrc() {
        return "image.jpg";
    }
}
