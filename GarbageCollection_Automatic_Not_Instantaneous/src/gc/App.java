package gc;

public class App {
    public static void main(String[] args){
        //If gc does garbage collection, finalize() method will be called. But, here gc does not do it's task. If we increase the number of iterations to 100, gc comes into picture.
        //For garbage collection, gc has to interrupt other threads. So, it acts only when there is dire need of memory.
        //Garbage collection is not instantaneous.
        for (int i = 0; i < 1; i++){
            Heavy heavy = new Heavy();
            System.out.println(heavy);
        }
    }
}
