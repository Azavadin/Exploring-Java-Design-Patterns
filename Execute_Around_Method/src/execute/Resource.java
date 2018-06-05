package execute;

public class Resource{

    private Resource(){
        System.out.println("Resource created...");
    }
    public void fun1() {
        System.out.println("fun1 called....");
    }

    public void fun2() {
        System.out.println("fun2 called....");
    }

    public void close() {
        System.out.println("Cleaning up....");
    }

    public static void use(UseResource useResource){
        Resource resource = new Resource();
        try {
            useResource.accept(resource);
        }
        finally {
            resource.close();
        }
    }
}
