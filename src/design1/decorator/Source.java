package design1.decorator;

public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("The orginal method");
    }
}
