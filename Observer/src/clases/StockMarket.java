package clases;

/**
 *
 * @author Josue
 */

// Subject
public interface StockMarket {

    void addObserver(Investor investor);

    void removeObserver(Investor investor);

    void notifyObservers(String stockSymbol, double price);
}
