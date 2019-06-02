package com.neal.HeadFirstPractise.command;

import com.neal.HeadFirstPractise.command.request.Command;

public class SimpleRemoteControl {
	Command slot;

	public SimpleRemoteControl() {
	}
	
	public void setCommand(Command command){
		slot =command;
	}
	
	public void buttonPress(){
		slot.execute();
	}
}
