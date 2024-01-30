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
        // Lógica específica para el estado de pedido entregado
        // Puede incluir la confirmación de entrega, cierre del pedido, etc.
        context.setState(this); // No hay transición de estado adicional después de la entrega
    }
}
