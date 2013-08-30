package com.openxc.measurements;

import java.util.Locale;
import com.openxc.units.State;

/**
 * PassengerMirrorCommands track the passenger mirror dpad use.
 * 
 */
public class PassengerMirrorCommand extends
		BaseMeasurement<State<PassengerMirrorCommand.MirrorCommand>> {
	public final static String ID = "passenger_mirror_command";

	public enum MirrorCommand {
		IDLE, 
		UP, 
		DOWN, 
		LEFT, 
		RIGHT, 
		FOLD, 
		UNFOLD
	}

	public PassengerMirrorCommand(State<MirrorCommand> value) {
		super(value);
	}

	public PassengerMirrorCommand(MirrorCommand value) {
		this(new State<MirrorCommand>(value));
	}

	public PassengerMirrorCommand(String value) {
		this(MirrorCommand.valueOf(value.toUpperCase(Locale.US)));
	}

	@Override
	public String getGenericName() {
		return ID;
	}
}
