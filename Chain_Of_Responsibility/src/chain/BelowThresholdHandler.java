package chain;

public class BelowThresholdHandler extends OurDataHandler{
    private int threshold;

    public BelowThresholdHandler(int val) {
        super();
        threshold = val;
    }

    public BelowThresholdHandler(int val, OurDataHandler ourDataHandler) {
        super(ourDataHandler);
        this.threshold = val;
    }

    public void handle(int val){
        if (val < threshold)
        System.out.println("value "+val+" dropped below the threshold "+threshold);
        else
            super.handle(val);
    }
}
