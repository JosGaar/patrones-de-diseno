package clases;


/**
 *
 * @author Josue
 */

// Adaptee
public class CSVFormatter {

    private String csvData;

    public CSVFormatter(String csvData) {
        this.csvData = csvData;
    }

    public String formatCSV() {
        // Lógica para formatear CSV a JSON
        return "{ \"data\": \"" + csvData + "\" }";
    }
}
