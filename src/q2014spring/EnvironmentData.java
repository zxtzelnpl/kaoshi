package q2014spring;

import java.util.*;

public class EnvironmentData implements Subject {      //（1）
    private ArrayList observers;

    private float temperature, humidity, cleanness;

    public EnvironmentData(){observers = new ArrayList();}

    public void registerObserver(Observer o){ observers.add(o);}
    public void removeObserver(Observer o) {}
    public void notifyObservers(){
        for(int i=0;i<observers.size();i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature,humidity,cleanness);    //(2)
        }
    }

    public void measurementsChanged(){
        this.notifyObservers();         //  (3)
    }

    public void setMeasurements(float temperature,float humidity, float cleanness){
        this.temperature = temperature;
        this.humidity = humidity;
        this.cleanness = cleanness;
        this.measurementsChanged();     // (4)
    }
}
