package iterator;

import java.util.*;

public class App {
    public static void main(String[] args){
        List<Person> people = Arrays.asList(
                new Person("Sriram", "Pandyan"),
                new Person("Gautam", "Ramasami"),
                new Person("Manoj", "Cebol")
        );

        Set<Person> personSet = new HashSet<Person>();
        personSet.add(new Person("Sriram", "Pandyan"));
        personSet.add(new Person("Gautam", "Ramasami"));
        personSet.add(new Person("Manoj", "Cebol"));

        System.out.println("Printing the List........");
        iterateAndPrint(people.iterator());
        System.out.println("  ");
        System.out.println("Printing the Set............");
        iterateAndPrint(personSet.iterator());
    }

    private static void iterateAndPrint(Iterator<Person> iterator) {
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
