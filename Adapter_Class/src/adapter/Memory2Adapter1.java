package adapter;

public class Memory2Adapter1 extends Memory2 implements Memory {
    public void store(int i, byte b){
        System.out.println("Storing using Adapter......");
        super.setAddress(2222);
        super.write((byte)111);
    }
}
