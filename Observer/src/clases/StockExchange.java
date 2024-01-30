package clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josue
 */

// ConcreteSubject 
public class StockExchange implements StockMarket {

    private List<Investor> investors = new ArrayList<>();
    private String stockSymbol;
    private double price;

    public void setStockPrice(String stockSymbol, double price) {
        this.stockSymbol = stockSymbol;
        this.price = price;
        notifyObservers(stockSymbol, price);
    }

    @Override
    public void addObserver(Investor investor) {
        investors.add(investor);
    }

    @Override
    public void removeObserver(Investor investor) {
        investors.remove(investor);
    }

    @Override
    public void notifyObservers(String stockSymbol, double price) {
        for (Investor investor : investors) {
            investor.notify(stockSymbol, price);
        }
    }
}
