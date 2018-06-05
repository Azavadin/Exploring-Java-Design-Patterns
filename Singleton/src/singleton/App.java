package singleton;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args){
        EnumDBManager enumDBManager1 = EnumDBManager.INSTANCE;
        EnumDBManager enumDBManager2 = EnumDBManager.INSTANCE;
        System.out.println(enumDBManager1);
        System.out.println(enumDBManager2);

        DBManager instance1 = DBManager.getInstance();
        DBManager instance2 = DBManager.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);

        // By using ENUM, we successfully got the same instance for multiple threads.
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        executorService.submit(App::getDBManager);
        executorService.submit(App::getDBManager);
        executorService.submit(App::getDBManager);
        executorService.submit(App::getDBManager);
        executorService.submit(App::getDBManager);
        executorService.submit(App::getDBManager);
    }

    private static void getDBManager() {
        DBManager dbManager = DBManager.getInstance();
        System.out.println("Multi Threading : "+dbManager);
    }
}
