package com.neal.HeadFirstPractise.command.request;

import com.neal.HeadFirstPractise.command.receiver.Stereo;

public class StereoOffCommand implements Command {
	Stereo stereo;
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		stereo.off();
	}

	public void undo() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume();
	}

}
