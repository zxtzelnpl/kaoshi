package design1.adapter.forObject;

public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }

    @Override
    public void method2() {
        System.out.println("This is the targetable method");
    }

    @Override
    public void method1() {
        source.method1();
    }
}
