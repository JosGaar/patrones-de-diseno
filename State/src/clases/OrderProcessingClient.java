package clases;

/**
 *
 * @author Josue
 */

// Client
public class OrderProcessingClient {

    public static void main(String[] args) {
        OrderContext orderContext = new OrderContext();

        // Proceso de pedido en diferentes estados
        orderContext.processOrder(); // Nuevo pedido
        orderContext.processOrder(); // Pedido enviado
        orderContext.processOrder(); // Pedido entregado
    }
}
