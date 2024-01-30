package clases;

/**
 *
 * @author Josue
 */

// Client
public class PaymentClient {

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // Configurar la estrategia de impuestos para productos básicos
        paymentProcessor.setTaxStrategy(new BasicTaxCalculation());
        double totalAmountForBasicProduct = paymentProcessor.processPayment(150.0);
        System.out.println("Total amount for basic product: $" + totalAmountForBasicProduct);

        // Configurar la estrategia de impuestos para productos de lujo
        paymentProcessor.setTaxStrategy(new LuxuryTaxCalculation());
        double totalAmountForLuxuryProduct = paymentProcessor.processPayment(250.0);
        System.out.println("Total amount for luxury product: $" + totalAmountForLuxuryProduct);
    }
}
