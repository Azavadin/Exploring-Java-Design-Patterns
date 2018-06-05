package chain;

public class AboveThresholdHandler extends OurDataHandler{
    private int threshold;

    public AboveThresholdHandler(int val, OurDataHandler ourDataHandler) {
        super(ourDataHandler);
        this.threshold = val;
    }

    public AboveThresholdHandler(int val) {
        super();
        threshold = val;
    }

    public void handle(int val){
        if (val > threshold)
            System.out.println("value "+val+" exceeded the threshold "+threshold);
        else
            super.handle(val);
    }
}
