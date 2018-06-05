package execute;

public class App {
    public static void main(String[] args){
        Resource.use(new UseResource(){
            @Override
            public void accept(Resource resource) {
                resource.fun1();
                resource.fun2();
            }
        });
    }
}
