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
        // L�gica de procesamiento de pago

        // Calcular impuestos seg�n la estrategia elegida
        double taxAmount = taxStrategy.calculateTax(productPrice);

        // Otros c�lculos y l�gica de procesamiento
        return productPrice + taxAmount;
    }
}
