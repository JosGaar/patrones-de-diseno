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
        // L�gica espec�fica para el estado de pedido enviado
        // Puede incluir la actualizaci�n del estado de env�o, notificaci�n al cliente, etc.
        context.setState(new DeliveredOrderState());
    }
}
