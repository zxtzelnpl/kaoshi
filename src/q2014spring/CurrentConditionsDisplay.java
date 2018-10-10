package q2014spring;

public class CurrentConditionsDisplay implements Observer {         //(5)
    private float temperature;
    private float humidity;
    private float cleanness;
    private Subject envData;
    public CurrentConditionsDisplay(Subject envData){
        this.envData = envData;
        this.envData.registerObserver(this);    //(6)
    }

    public void update(float temperature,float humidity,float cleanness){
        this.temperature = temperature;
        this.humidity = humidity;
        this.cleanness = cleanness;
        display();
    }

    public void display(){}
}
