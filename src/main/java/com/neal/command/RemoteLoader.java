package com.neal.HeadFirstPractise.command;

import com.neal.HeadFirstPractise.command.receiver.GarageDoor;
import com.neal.HeadFirstPractise.command.receiver.Light;
import com.neal.HeadFirstPractise.command.receiver.Stereo;
import com.neal.HeadFirstPractise.command.request.Command;
import com.neal.HeadFirstPractise.command.request.GarageDoorCloseCommand;
import com.neal.HeadFirstPractise.command.request.GarageDoorOpenCommand;
import com.neal.HeadFirstPractise.command.request.LightOffCommand;
import com.neal.HeadFirstPractise.command.request.LightOnCommand;
import com.neal.HeadFirstPractise.command.request.PartyCommand;
import com.neal.HeadFirstPractise.command.request.StereoOffCommand;
import com.neal.HeadFirstPractise.command.request.StereoOnWithCDCommand;

public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControl remoteControl =new RemoteControl();
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		Stereo stereo =new Stereo();
		
		
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand LightOffCommand = new LightOffCommand(light);
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
		StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
		
		remoteControl.setCommand(0, lightOnCommand, LightOffCommand);
		remoteControl.setCommand(1, garageDoorOpenCommand, garageDoorCloseCommand);
		remoteControl.setCommand(2, stereoOnWithCDCommand, stereoOffCommand);
		
		remoteControl.onButtonPress(0);
		remoteControl.offButtonPress(0);
		remoteControl.undo();
		remoteControl.onButtonPress(1);
		remoteControl.offButtonPress(1);
		remoteControl.onButtonPress(2);
		remoteControl.offButtonPress(2);
		remoteControl.undo();
		remoteControl.undo();
		
		System.out.println("Party!-----------------------");
		Command[] party = new Command[]{lightOnCommand,garageDoorOpenCommand,stereoOnWithCDCommand};
		PartyCommand partyCommand = new PartyCommand(party);
		remoteControl.setCommand(3, partyCommand, stereoOffCommand);
		remoteControl.onButtonPress(3);
		remoteControl.undo();
	}
}
