package single_responsibility;

/**
 *
 * @author Josue
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Rectangulo rectangulo = new Rectangulo(10, 10);
        Presentacion presentacion = new Presentacion();
        presentacion.imprimir(rectangulo);
    }
}
