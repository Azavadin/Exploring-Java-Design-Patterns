package adapter;

public class App {
    public static void main(String[] args){
        Computer computer = new Computer(new Memory1());
        computer.work();

        Computer computer1 = new Computer(new Memory2Adapter1());
        computer1.work();
    }
}
