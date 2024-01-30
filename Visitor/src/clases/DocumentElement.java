package clases;

/**
 *
 * @author Josue
 */

// Element
public interface DocumentElement {

    void accept(DocumentVisitor visitor);

}
