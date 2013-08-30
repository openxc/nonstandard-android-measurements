package com.openxc.measurements;

import java.util.Locale;
import com.openxc.units.State;

/**
 *  LeftDPadCommand captures presses on the left steering wheel dpad
 *  Note: the original function of the dpad is not affected. 
 */
public class LeftDPadCommand extends
	BaseMeasurement<State<LeftDPadCommand.LeftDPadCommands>> {
	public final static String ID = "left_dpad_command";
	
	public enum LeftDPadCommands {
		IDLE,
		UP,
		DOWN,
		LEFT,
		RIGHT,
		CENTER
	}
	
	public LeftDPadCommand(State<LeftDPadCommands> value) {
		super(value);
	}
	
	public LeftDPadCommand(LeftDPadCommands value) {
		this(new State<LeftDPadCommands>(value));
	}
	
	public LeftDPadCommand(String value) {
		this(LeftDPadCommands.valueOf(value.toUpperCase(Locale.US)));
	}
	
	@Override
	public String getGenericName() {
		return ID;
	}
}
