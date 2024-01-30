package clases;

/**
 *
 * @author Josue
 */

// Client
public class OnlineShoppingClient {

    public static void main(String[] args) {

        // El cliente utiliza la interfaz simplificada proporcionada por la Fachada
        OnlineShoppingFacade shoppingFacade = new OnlineShoppingFacade();
        shoppingFacade.purchaseProduct("Laptop", "Credit Card", 2, "123 Main St");
    }
}
