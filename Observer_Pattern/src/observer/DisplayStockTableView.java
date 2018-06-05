package observer;

import java.util.Observable;
import java.util.Observer;

public class DisplayStockTableView implements Observer {
    public void update(Observable observable, Object data){
        System.out.println("Stock Value in Table View: "+ data);
    }
}
