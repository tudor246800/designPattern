package com.neal.HeadFirstPractise.command.request;

public class PartyCommand implements Command {
	Command[] commands;
	
	
	public PartyCommand(Command[] commands) {
		this.commands = commands;
	}

	public void execute() {
		for(int i =0;i<commands.length;i++)
			commands[i].execute();
	}

	public void undo() {
		for(int i =0;i<commands.length;i++)
			commands[i].undo();
	}

}
