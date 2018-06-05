package chain;

public abstract class OurDataHandler {
    private OurDataHandler next;

    public OurDataHandler(int val) {

    }

    public OurDataHandler(OurDataHandler ourDataHandler) {
        next = ourDataHandler;
    }

    public OurDataHandler() {

    }

    public void handle(int val){
        if (next != null)
            next.handle(val);
    }
}
