package com.openxc.measurements;

import java.util.Locale;

import com.openxc.units.State;

/** 
 * The EVMode measurement is the current EV Mode
 */
public class EVMode extends BaseMeasurement<State<EVMode.EVModes>> {
	public final static String ID = "ev_mode";
	
	public enum EVModes {
        NO_PREF,
        EV_DRIVING,
        CHARGE_DEPLETING,
        CHARGE_SUSTAINING,
        CHARGE_DEPLETING_ENGINE_ON,
        CHARGE_SUSTAINING_ENGINE_ON
	}
	
	public EVMode(State<EVModes> value) {
		super(value);
	}

	public EVMode(EVModes value) {
		this(new State<EVModes>(value));
	}
    public EVMode(String value) {
        this(EVModes.valueOf(value.toUpperCase(Locale.US)));
    }
	
    @Override
    public String getGenericName() {
        return ID;
    }
}
