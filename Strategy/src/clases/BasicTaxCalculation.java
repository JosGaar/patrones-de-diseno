package clases;

/**
 *
 * @author Josue
 */

// ConcreteStrategy
public class BasicTaxCalculation implements TaxCalculationStrategy {

    @Override
    public double calculateTax(double productPrice) {
        return 0.1 * productPrice; // Impuesto básico del 10%
    }
}
