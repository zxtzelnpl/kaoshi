package design1.bridge;

public class SourceSub1 implements Sourceable {
    @Override
    public void method() {
        System.out.println("This is the first sub!");
    }
}
