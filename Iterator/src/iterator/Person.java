package iterator;

public class Person {
    String first;
    String last;
    public Person(String first, String last) {
        this.first = first;
        this.last = last;
    }
    public String toString(){
        return String.format("%s %s", first, last);
    }
}
