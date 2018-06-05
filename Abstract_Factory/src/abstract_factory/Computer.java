package abstract_factory;

public class Computer {
    CPU cpu;
    Memory mem;
    public void add(CPU cpu){
        this.cpu = cpu;
    }

    public void add(Memory mem) {
        this.mem = mem;
    }

    public String toString(){
        return String.format("%s %s %s", getClass(), cpu, mem);
    }
}
