package chain;

public class App {
    public static void main(String[] args){
        OurDataSource ourDataSource = new OurDataSource();
        AboveThresholdHandler aboveThresholdHandler = new AboveThresholdHandler(500);
        BelowThresholdHandler belowThresholdHandler = new BelowThresholdHandler(500, aboveThresholdHandler );
        EvenThresholdHandler evenThresholdHandler = new EvenThresholdHandler(belowThresholdHandler);
        MagicThresholdHandler magicThresholdHandler = new MagicThresholdHandler(evenThresholdHandler);
        ourDataSource.addListener(magicThresholdHandler);
        ourDataSource.start();
    }
}
