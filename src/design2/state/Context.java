package design2.state;

public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void method(){
        if(state.getValue().equals("state1")){
            state.methdo1();
        }
        else if(state.getValue().equals("state2")){
            state.method2();
        }
    }
}
