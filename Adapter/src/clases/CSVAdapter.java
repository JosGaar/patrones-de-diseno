package clases;

/**
 *
 * @author Josue
 */

// Adapter
public class CSVAdapter implements IJSONFormatter {
    
    private CSVFormatter csvFormatter;
    
    public CSVAdapter(CSVFormatter csvFormatter) {
        this.csvFormatter = csvFormatter;
    }
    
    @Override
    public String formatJSON() {
        // Adaptacion de la llamada al Adaptee
        return csvFormatter.formatCSV();
    }
}
