package observer;

import java.util.Observable;
import java.util.Observer;

public class DisplayStock implements Observer{
    public void update(Observable observable, Object data){
        System.out.println("Stock Value : "+ data);
    }
}
