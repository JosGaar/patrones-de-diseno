package clases;

/**
 *
 * @author Josue
 */

// ConcreteElement
public class Table implements DocumentElement {

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visitTable(this);
    }

    // L�gica espec�fica para tablas
    public String getTableData() {
        return "Table data";
    }
}
