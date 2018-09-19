package q2018spring;

public class ConcreteBuilder2 implements Builder {
    private Product product;

    public ConcreteBuilder2() {
        product = new Product();
    }

    public void buildPartA(){}

    public void buildPartB(){}

    public Product getResult(){
        return product;
    }
}
