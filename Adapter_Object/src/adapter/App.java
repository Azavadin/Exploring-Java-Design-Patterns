package adapter;

public class App {
    public static void main(String[] args){
        Computer computer = new Computer(new Memory1());
        computer.work();

        Computer computer1 = new Computer(new Memory2Adapter2(new Memory2()));
        computer1.work();
    }
}
