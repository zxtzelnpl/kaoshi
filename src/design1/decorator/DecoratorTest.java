package design1.decorator;

public class DecoratorTest {
    public static void main(String[] args){
        Sourceable obj = new Decorator(new Source());
        obj.method();
    }
}
