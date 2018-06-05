package adapter;

public class Memory2Adapter2 implements Memory {
    private Memory2 memory2;

    public Memory2Adapter2(Memory2 memory2){
        this.memory2 = memory2;
    }
    public void store(int i, byte b){
        System.out.println("Storing using Adapter......");
        memory2.setAddress(2222);
        memory2.write((byte)111);
    }
}
