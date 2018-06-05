package strategy;

public class App {
    public static void main(String args[]){
        System.out.println("Strategy Pattern");
        AddOperation obj = new AddOperation();
        SubtractionOperation obj2 = new SubtractionOperation();

        Context context = new Context(obj2);
        System.out.println(context.executeStrategy(5,4));
        //System.out.println(multiply(5,4), mul);
    }
}
