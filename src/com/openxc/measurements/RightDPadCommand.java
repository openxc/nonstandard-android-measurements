package com.openxc.measurements;

import java.util.Locale;
import com.openxc.units.State;

/**
 *  RightDPadCommand captures presses on the right steering wheel dpad cluster
 *  Note: the original function of the dpad is not affected. 
 */
public class RightDPadCommand extends
	BaseMeasurement<State<RightDPadCommand.RightDPadCommands>> {
	public final static String ID = "right_dpad_command";
	
	public enum RightDPadCommands {
		IDLE,
		UP,
		DOWN,
		LEFT,
		RIGHT,
		CENTER,
		FORWARD,
		BACK,
		SPEAK,
		MUTE,
		VOL_UP,
		VOL_DOWN
	}
	
	public RightDPadCommand(State<RightDPadCommands> value) {
		super(value);
	}
	
	public RightDPadCommand(RightDPadCommands value) {
		this(new State<RightDPadCommands>(value));
	}
	
	public RightDPadCommand(String value) {
		this(RightDPadCommands.valueOf(value.toUpperCase(Locale.US)));
	}
	
	@Override
	public String getGenericName() {
	return ID;
	}
}
