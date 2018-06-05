package strategy;

public class SubtractionOperation implements Strategy{
    public int doOperation(int a, int b){
        return a-b;
    }
}
