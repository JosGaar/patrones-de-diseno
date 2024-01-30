package clases;

/**
 *
 * @author Josue
 */

// Singleton
public class Logger {
    
    private static Logger instance;
    
    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null){
            synchronized (Logger.class) {
                if (instance == null) { 
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
    
    // Metodos de registro
    public void logInfo(String message) {
        System.out.println("Info: " + message);
    }
    
    public void logError(String message) {
        System.out.println("Error: " + message);
    }
}
