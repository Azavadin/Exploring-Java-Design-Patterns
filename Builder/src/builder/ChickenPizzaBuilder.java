package builder;

public class ChickenPizzaBuilder extends PizzaBuilder{
    public void createCrust(){
        getPizza().createCrust();
    }

    public void addSauce(){
        getPizza().addSauce();
    }

    public void addToppings(String[] toppings){
        getPizza().addToppings(new String[]{"Chicken", "Mutton"});
    }

    public void addCheese(String cheese){
        getPizza().addCheese("Mild Cheese");
    }

    public void bake(){}
}
