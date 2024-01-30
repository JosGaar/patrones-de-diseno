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
        // L�gica espec�fica para el estado de nuevo pedido
        // Puede incluir la verificaci�n de inventario, asignaci�n de recursos, etc.
        context.setState(new ShippedOrderState());
    }
}
