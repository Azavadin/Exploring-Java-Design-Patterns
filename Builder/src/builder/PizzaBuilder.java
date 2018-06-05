package builder;

public abstract class PizzaBuilder {
    private Pizza pizza = new Pizza();

    protected Pizza getPizza(){
        return pizza;
    }
    public Pizza getPizzaCreated(){
        return pizza;
    }

    public abstract void createCrust();

    public abstract void addSauce();

    public abstract void addToppings(String[] toppings);

    public abstract void addCheese(String cheese);

    public abstract void bake();
}
