package builder;

public class App {
    public static void main(String[] args){
        CheesePizzaBuilder cheesePizzaBuilder = new CheesePizzaBuilder();
        PizzaDirector pizzaDirector = new PizzaDirector();
        pizzaDirector.makePizza(cheesePizzaBuilder);
        Pizza pizza = cheesePizzaBuilder.getPizzaCreated();
        System.out.println(pizza);

        ChickenPizzaBuilder chickenPizzaBuilder = new ChickenPizzaBuilder();
        pizzaDirector.makePizza(chickenPizzaBuilder);
        Pizza chickenPizza = chickenPizzaBuilder.getPizzaCreated();
        System.out.println(chickenPizza);
    }
}
