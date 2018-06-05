package abstract_factory;

public class App {
    public static void main(String[] args){
        ComputerA compA = new ComputerA();
        createComputer(compA, new ComputerFactoryA());
        System.out.println(compA);

        ComputerB compB = new ComputerB();
        createComputer(compB, new ComputerFactoryB());
        System.out.println(compB);
    }

    private static void createComputer(Computer comp, ComputerFactory computerFactory) {
        comp.add(computerFactory.getCPU());
        comp.add(computerFactory.getMemory());
    }

}
