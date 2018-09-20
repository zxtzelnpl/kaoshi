package q2017spring;

abstract class PizzaBuilder {
    protected Pizza pizza;
    public Pizza getPizza(){return pizza;}
    public void createNewPizza(){pizza = new Pizza();}
    abstract void buildParts();     //public （1）
}
