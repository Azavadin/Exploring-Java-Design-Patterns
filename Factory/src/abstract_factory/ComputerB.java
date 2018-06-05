package abstract_factory;

public class ComputerB extends Computer{
    protected CPUB getCPU(){
        return new CPUB();
    }
    protected MemoryB getMemory(){
        return new MemoryB();
    }
}
