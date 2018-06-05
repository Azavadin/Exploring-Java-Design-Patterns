package observer;


import java.util.Observable;

public class Stock extends Observable{

    public void start(){
        Thread thread = new Thread(() -> generatePrice());
        thread.start();
    }


    private void generatePrice() {
        while (true){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Double val = Math.random();
        notifyObservers(val);
        setChanged();
        }
    }

}
