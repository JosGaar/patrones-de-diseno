package clases;

/**
 *
 * @author Josue
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Pizzeria pizzeria = new Pizzeria();
        
        Pizza pizzaPeperoni = pizzeria.crearPizzaChica();
        
        System.out.println(pizzaPeperoni);
        
    }
    
}
