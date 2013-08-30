package com.openxc.measurements;

import java.util.Locale;

import com.openxc.units.State;

/**
 * WindowCommand is a write only command to raise or lower the passenger side 
 * front window.  
 */

public class WindowCommand extends BaseMeasurement<State<WindowCommand.WindowCommands>> {
	
	public final static String ID = "window_command_passenger";
	public enum WindowCommands {
		IDLE,
		MANUAL_UP,
		AUTO_UP,
		MANUAL_DOWN,
		AUTO_DOWN
	};
	
    public WindowCommand(State<WindowCommands> value) {
        super(value);
    }

    public WindowCommand(WindowCommands value) {
        this(new State<WindowCommands>(value));
    }

    public WindowCommand(String value) {
        this(WindowCommands.valueOf(value.toUpperCase(Locale.US)));
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
