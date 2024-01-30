package open_closed;

/**
 *
 * @author Josue
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Rectangulo rectangulo = new Rectangulo(10, 10);
        Triangulo triangulo = new Triangulo(10, 10);
        
        Presentacion presentacion = new Presentacion();

        presentacion.area(rectangulo);
        presentacion.area(triangulo);
    }
}
