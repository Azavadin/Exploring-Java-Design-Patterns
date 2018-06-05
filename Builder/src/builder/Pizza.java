package builder;

import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class Pizza {

    private Crust crust;
    private Sauce sauce;
    private String cheese;
    private String[] toppings;

    public void createCrust() {
        crust = new Crust();
    }

    public void addSauce() {
        sauce = new Sauce();
    }

    public void addCheese(String cheese) {
        this.cheese = cheese;
    }

    public void addToppings(String[] toppings) {
        this.toppings = toppings;
    }

    public void bake() {
    }

    public String toString(){
        String toppings1 = Stream.of(toppings)
                                    .collect(joining(","));
        return ""+crust+":"+sauce+":"+cheese+":"+toppings1;
    }
}
