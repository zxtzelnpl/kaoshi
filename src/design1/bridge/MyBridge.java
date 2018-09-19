package design1.bridge;

public class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }
}
