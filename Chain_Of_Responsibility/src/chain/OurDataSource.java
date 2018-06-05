package chain;

import java.util.Random;

public class OurDataSource {

    private OurDataHandler handler;

    public void start() {
        Random rand = new Random();
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int val = rand.nextInt(1000);
            System.out.println("Daata generated = "+val);
            handler.handle(val);
        }
    }

    public void addListener(OurDataHandler ourDataHandler) {
        handler = ourDataHandler;
    }
}
