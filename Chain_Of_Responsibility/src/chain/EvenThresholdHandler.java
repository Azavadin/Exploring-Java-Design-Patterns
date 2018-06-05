package chain;

public class EvenThresholdHandler extends OurDataHandler{
    public EvenThresholdHandler() {
        super();
    }

    public EvenThresholdHandler(OurDataHandler ourDataHandler) {
        super(ourDataHandler);
    }

    public void handle(int val){
        if (val % 2 == 0)
            System.out.println(" Threshold value "+val+" is Even ");
        else
            super.handle(val);
    }
}
