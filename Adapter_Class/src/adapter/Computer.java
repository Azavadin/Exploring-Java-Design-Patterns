package adapter;

public class Computer {
    Memory memory;
    public Computer(Memory memory) {
        this.memory = memory;
    }
    public void work(){
        memory.store(1111, (byte)100);
    }
}
