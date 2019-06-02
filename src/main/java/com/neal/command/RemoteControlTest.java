package com.neal.HeadFirstPractise.command;

import com.neal.HeadFirstPractise.command.receiver.GarageDoor;
import com.neal.HeadFirstPractise.command.receiver.Light;
import com.neal.HeadFirstPractise.command.request.GarageDoorOpenCommand;
import com.neal.HeadFirstPractise.command.request.LightOnCommand;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		simpleRemoteControl.setCommand(lightOnCommand);
		simpleRemoteControl.buttonPress();
		simpleRemoteControl.setCommand(garageDoorOpenCommand);
		simpleRemoteControl.buttonPress();
	}
}
