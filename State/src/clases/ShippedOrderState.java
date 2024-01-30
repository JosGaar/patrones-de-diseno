package clases;

/**
 *
 * @author Josue
 */

// ConcreteState
public class ShippedOrderState implements OrderState {

    @Override
    public void processOrder(OrderContext context) {
        System.out.println("Processing a shipped order.");
        // Lógica específica para el estado de pedido enviado
        // Puede incluir la actualización del estado de envío, notificación al cliente, etc.
        context.setState(new DeliveredOrderState());
    }
}
