package builder;


public class CheesePizzaBuilder extends PizzaBuilder{
    public void createCrust(){
        getPizza().createCrust();
    }

    public void addSauce(){
        getPizza().addSauce();
    }

    public void addToppings(String[] toppings){
        getPizza().addToppings(new String[]{"Tomatoes", "BellPeppers"});
    }

    public void addCheese(String cheese){
        getPizza().addCheese("Super Cheese");
    }

    public void bake(){}
}
