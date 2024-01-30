package clases;

/**
 *
 * @author Josue
 */

// ConcreteState
public class DeliveredOrderState implements OrderState {

    @Override
    public void processOrder(OrderContext context) {
        System.out.println("Processing a delivered order.");
        // L�gica espec�fica para el estado de pedido entregado
        // Puede incluir la confirmaci�n de entrega, cierre del pedido, etc.
        context.setState(this); // No hay transici�n de estado adicional despu�s de la entrega
    }
}
