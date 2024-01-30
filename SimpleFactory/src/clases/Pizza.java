package clases;

/**
 *
 * @author Josue
 */
public class Pizza {
    
    private int cantidadRebanadas;
    
    public Pizza(int cantidadRebanadas) {
        this.cantidadRebanadas= cantidadRebanadas;
    }
    
    @Override
    public String toString() {
        return "Cantidad rebanadas : " + this.cantidadRebanadas;
    }
}
