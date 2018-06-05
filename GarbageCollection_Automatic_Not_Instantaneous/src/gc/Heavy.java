package gc;

public class Heavy {
    private int[] values = new int[10];
    public void finalize(){
        System.out.println("finalized");
    }
}
