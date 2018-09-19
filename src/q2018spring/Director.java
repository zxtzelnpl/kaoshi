package q2018spring;

public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    void construct(){
        this.builder.buildPartA();  //(5)
        this.builder.buildPartB();  //(5)
    }
}
