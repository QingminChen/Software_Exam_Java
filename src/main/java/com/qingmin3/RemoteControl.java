package com.qingmin3;

public class RemoteControl {
    Command[] onCommands=new Command[7];
    Command[] offCommands=new Command[7];
    public RemoteControl(){

    };
    public void setCommnad(int slot,Command onCommand,Command offCommand){
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    };
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    };
    public void OffButtonWasPushed(int slot){
        offCommands[slot].execute();
    };
}
