package abstract_factory;

public class ComputerA extends Computer{
    protected CPUA getCPU(){
     return new CPUA();
    }
    protected MemoryA getMemory(){
        return new MemoryA();
    }
}
