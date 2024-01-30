package clases;

/**
 *
 * @author Josue
 */

// ConcreteStrategy
public class LuxuryTaxCalculation implements TaxCalculationStrategy {

    @Override
    public double calculateTax(double productPrice) {
        return 0.2 * (productPrice - 100); // Impuesto de lujo del 20%, pero solo sobre el excedente de $100
    }
}
