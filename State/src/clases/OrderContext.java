package clases;

/**
 *
 * @author Josue
 */

// Context
public class OrderContext {

    private OrderState currentState;

    public OrderContext() {
        // Inicializar con un estado predeterminado
        currentState = new NewOrderState();
    }

    public void setState(OrderState newState) {
        currentState = newState;
    }

    public OrderState getCurrentState() {
        return currentState;
    }

    public void processOrder() {
        currentState.processOrder(this);
    }

}
