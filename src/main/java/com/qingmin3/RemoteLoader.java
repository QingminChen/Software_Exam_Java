package com.qingmin3;

public class RemoteLoader {
    public static void main(String[] args){
        RemoteControl remoteControl=new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        remoteControl.setCommnad(0,livingRoomLightOn,livingRoomLightOff);
        remoteControl.setCommnad(1,kitchenLightOn,kitchenLightOff);
        remoteControl.onButtonWasPushed(0);
        remoteControl.OffButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.OffButtonWasPushed(1);
    }
}
