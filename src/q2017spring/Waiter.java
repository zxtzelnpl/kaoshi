package q2017spring;

public class Waiter {
    private PizzaBuilder pizzaBuilder;
    public void setPizzaBuilder(PizzaBuilder pizzaBuilder){
        /*设置构建器*/
        this.pizzaBuilder = pizzaBuilder;       //（2）
    }
    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }
    public void construct(){
        /*构建*/
        pizzaBuilder.createNewPizza();
        pizzaBuilder.buildParts();//（3）
    }
}
