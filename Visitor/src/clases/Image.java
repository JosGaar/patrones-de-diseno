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

    // L�gica espec�fica para im�genes
    public String getImageSrc() {
        return "image.jpg";
    }
}
