package abstract_factory;

public class ComputerFactoryA implements ComputerFactory{
    public CPU getCPU(){
     return new CPUA();
    }
    public Memory getMemory(){
        return new MemoryA();
    }
}
