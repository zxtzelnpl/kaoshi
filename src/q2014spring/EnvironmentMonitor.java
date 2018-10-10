package q2014spring;

public class EnvironmentMonitor {
    public static void main(String[] args){
        EnvironmentData envData = new EnvironmentData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(envData);
        envData.setMeasurements(80,65,30.4f);
    }
}
