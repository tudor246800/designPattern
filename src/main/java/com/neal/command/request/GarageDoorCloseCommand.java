package com.neal.HeadFirstPractise.command.request;

import com.neal.HeadFirstPractise.command.receiver.GarageDoor;

public class GarageDoorCloseCommand implements Command {
	GarageDoor garageDoor;
	
	public GarageDoorCloseCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.down();
	}

	public void undo() {
		garageDoor.up();
		
	}

}
