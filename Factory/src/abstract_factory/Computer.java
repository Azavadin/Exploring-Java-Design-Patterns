package abstract_factory;

public abstract class Computer {
    CPU cpu;
    Memory mem;
    public void configureComputer(){
        cpu = getCPU();
        mem = getMemory();
    }

    protected abstract CPU getCPU();
    protected abstract Memory getMemory();


    public String toString(){
        return String.format("%s %s %s", getClass(), cpu, mem);
    }
}
