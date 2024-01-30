package clases;

/**
 *
 * @author Josue
 */
// Client
public class Client {

    public static void main(String[] args) {

        // Obtener la instancia del Logger
        Logger logger1 = Logger.getInstance();
        System.out.println(logger1 + "\n");

        // Utilizar el Logger
        logger1.logInfo("Inicio de la aplicacion");
        logger1.logError("Algo salió mal");

        // Intentando crear otra instancia
        Logger logger2 = Logger.getInstance();
        System.out.println("\n" + logger2);

    }
}
