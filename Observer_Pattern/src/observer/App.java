package observer;

public class App {
    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.start();

        DisplayStock displayStock = new DisplayStock();
        stock.addObserver(displayStock);

        DisplayStockGridView displayStockGridView = new DisplayStockGridView();
        stock.addObserver(displayStockGridView);

        DisplayStockTableView displayStockTableView = new DisplayStockTableView();
        stock.addObserver(displayStockTableView);
    }
}
