package clases;

/**
 *
 * @author Josue
 */

// ConcreteState
public class NewOrderState implements OrderState {

    @Override
    public void processOrder(OrderContext context) {
        System.out.println("Processing a new order.");
        // Lógica específica para el estado de nuevo pedido
        // Puede incluir la verificación de inventario, asignación de recursos, etc.
        context.setState(new ShippedOrderState());
    }
}
