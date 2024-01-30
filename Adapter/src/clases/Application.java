package clases;

/**
 *
 * @author Josue
 */
public class Application {
    public static void main(String[] args) {
        
        // Crear un objeto Adaptee
        CSVFormatter csvFormatter = new CSVFormatter("1,John,Smith");
        
        // Utilizar el Adapter para adaptar la interfaz
        IJSONFormatter jsonFormatter = new CSVAdapter(csvFormatter);
        
        // El cliente trabaj con la interfaz target
        System.out.println("Formatted JSON: " + jsonFormatter.formatJSON());
    }
}
