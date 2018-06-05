package abstract_factory;

public class App {
    public static void createComputer(Computer computer){
        computer.configureComputer();
        System.out.println(computer);
    }
    public static void main(String[] args){
        ComputerA compA = new ComputerA();
        ComputerB compB = new ComputerB();

        createComputer(compA);
        createComputer(compB);
    }

}
