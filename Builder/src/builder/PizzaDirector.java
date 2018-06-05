package builder;

public class PizzaDirector {
    public void makePizza(PizzaBuilder pizzaBuilder){
        pizzaBuilder.createCrust();
        pizzaBuilder.addSauce();
        pizzaBuilder.addCheese("Macoroni");
        pizzaBuilder.addToppings(new String[]{"Carrots", "Onions"});
        pizzaBuilder.bake();
    }
}
