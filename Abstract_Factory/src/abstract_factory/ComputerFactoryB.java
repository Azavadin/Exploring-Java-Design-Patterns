package abstract_factory;

public class ComputerFactoryB implements ComputerFactory{
    public CPU getCPU(){
        return new CPUB();
    }
    public Memory getMemory(){
        return new MemoryB();
    }
}
