package singleton;

public enum EnumDBManager {
    INSTANCE;
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
