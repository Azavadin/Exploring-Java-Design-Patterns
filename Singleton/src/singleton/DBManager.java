package singleton;

public final class DBManager {
    private static final DBManager INSTANCE = new DBManager();
    public static DBManager getInstance(){
        return INSTANCE;
    }
}
