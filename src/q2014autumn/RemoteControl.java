package q2014autumn;

public class RemoteControl {
    Command[] onCommands = new Command[7];
    Command[] offCommands = new Command[7];
    public RemoteControl(){};
    public void setOnCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot] = onCommand;           // (4)
        offCommands[slot] = offCommand;         // (5)
    }
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();             // (6)
    }
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();            // (7)
    }
}
