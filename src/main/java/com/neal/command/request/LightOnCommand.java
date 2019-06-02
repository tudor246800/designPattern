package com.neal.HeadFirstPractise.command.request;

import com.neal.HeadFirstPractise.command.receiver.Light;

public class LightOnCommand implements Command {
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();

	}

	public void undo() {
		light.off();
	}

}
