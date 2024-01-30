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

    // Lógica específica para tablas
    public String getTableData() {
        return "Table data";
    }
}
