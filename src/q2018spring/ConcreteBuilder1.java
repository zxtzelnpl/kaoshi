package q2018spring;

public class ConcreteBuilder1 implements Builder {
    private Product product;

    public ConcreteBuilder1() {
        product = new Product();
    }

    public void buildPartA(){
        product.setPartA("Component A");    //(3)
    }

    public void buildPartB(){
        product.setPartB("Component B");    //(4)
    }

    public Product getResult(){
        return product;
    }
}
