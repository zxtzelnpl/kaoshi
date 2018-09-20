package q2017spring;

public class FastFoodOrdering {
    public static void main(String[] args){
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();
        waiter.setPizzaBuilder(hawaiian_pizzabuilder);//（4）
        waiter.construct();//（5）
        System.out.println("pizza:"+waiter.getPizza());
    }
}
