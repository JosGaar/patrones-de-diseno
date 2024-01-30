package clases;

/**
 *
 * @author Josue
 */

// Client
public class StockMarketClient {

    public static void main(String[] args) {
        StockExchange stockMarket = new StockExchange();

        // Crear inversores
        Investor investor1 = new StockInvestor("Investor 1");
        Investor investor2 = new StockInvestor("Investor 2");

        // Registrar inversores en la bolsa de valores
        stockMarket.addObserver(investor1);
        stockMarket.addObserver(investor2);

        // Simular cambios en el precio de las acciones
        stockMarket.setStockPrice("ABC", 50.0);
        stockMarket.setStockPrice("XYZ", 75.5);
    }
}
