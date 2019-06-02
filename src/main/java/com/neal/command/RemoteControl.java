package com.neal.HeadFirstPractise.command;

import java.util.Arrays;

import javax.swing.undo.UndoableEdit;

import com.neal.HeadFirstPractise.command.request.Command;
import com.neal.HeadFirstPractise.command.request.NoCommand;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;

	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonPress(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}

	public void offButtonPress(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undo(){
		undoCommand.undo();
	}

	@Override
	public String toString() {
		return "RemoteControl [onCommands=" + Arrays.toString(onCommands) + ", offCommands="
				+ Arrays.toString(offCommands) + "]";
	}

}
