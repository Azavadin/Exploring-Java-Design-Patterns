package chain;

public class MagicThresholdHandler extends OurDataHandler{
    public MagicThresholdHandler() {
        super();
    }

    public MagicThresholdHandler(OurDataHandler ourDataHandler) {
        super(ourDataHandler);
    }

    public void handle(int val){
        if (val % 11 == 0)
            System.out.println(" Threshold value "+val+" is Magic ");
        else
            super.handle(val);
    }
}
