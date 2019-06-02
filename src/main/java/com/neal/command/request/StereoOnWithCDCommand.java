package com.neal.HeadFirstPractise.command.request;

import com.neal.HeadFirstPractise.command.receiver.Stereo;

public class StereoOnWithCDCommand implements Command {
	Stereo stereo;
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume();
	}

	public void undo() {
		stereo.off();
	}

}
