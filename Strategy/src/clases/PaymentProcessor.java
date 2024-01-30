package clases;

/**
 *
 * @author Josue
 */

// Context
public class PaymentProcessor {

    private TaxCalculationStrategy taxStrategy;

    public void setTaxStrategy(TaxCalculationStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double processPayment(double productPrice) {
        // Lógica de procesamiento de pago

        // Calcular impuestos según la estrategia elegida
        double taxAmount = taxStrategy.calculateTax(productPrice);

        // Otros cálculos y lógica de procesamiento
        return productPrice + taxAmount;
    }
}
