package clases;

/**
 *
 * @author Josue
 */
// Facade
public class OnlineShoppingFacade {

    private PaymentProcessor paymentProcessor;
    private InventorySystem inventorySystem;
    private ShippingSystem shippingSystem;

    public OnlineShoppingFacade() {
        this.paymentProcessor = new PaymentProcessor();
        this.inventorySystem = new InventorySystem();
        this.shippingSystem = new ShippingSystem();
    }

    public void purchaseProduct(String product, String paymentMethod, int quantity, String shippingAddress) {
        double totalPrice = calculateTotalPrice(product, quantity);

        // Procesar pago
        paymentProcessor.processPayment(paymentMethod, totalPrice);

        // Actualizar inventario
        inventorySystem.updateInventory(product, quantity);

        // Enviar producto
        shippingSystem.shipProduct(product, shippingAddress);
    }

    private double calculateTotalPrice(String product, int quantity) {
        // Lógica para calcular el precio total basado en producto y cantidad
        // (Este es un ejemplo simplificado)
        return 50.0 * quantity;
    }
}
