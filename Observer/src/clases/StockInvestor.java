package clases;

/**
 *
 * @author Josue
 */

// ConcreteObserver
public class StockInvestor implements Investor {

    private String name;

    public StockInvestor(String name) {
        this.name = name;
    }

    @Override
    public void notify(String stockSymbol, double price) {
        System.out.println(this.name + " received update: Stock " + stockSymbol + " is now priced at $" + price);
    }
}
