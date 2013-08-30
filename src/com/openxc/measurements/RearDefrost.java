package com.openxc.measurements;

import java.util.Locale;

import com.openxc.units.State;

/** 
 * The RearDefrost measurement turns the rear window defroster on and off
 */
public class RearDefrost extends BaseMeasurement<State<RearDefrost.DefrostCommand>> {
	public final static String ID = "rear_defrost";
	
	public enum DefrostCommand {
		OFF,
		ON
	}
	public RearDefrost(State<DefrostCommand> value) {
		super(value);
	}

	public RearDefrost(DefrostCommand value) {
		this(new State<DefrostCommand>(value));
	}
    public RearDefrost(String value) {
        this(DefrostCommand.valueOf(value.toUpperCase(Locale.US)));
    }
	
    @Override
    public String getGenericName() {
        return ID;
    }
}
