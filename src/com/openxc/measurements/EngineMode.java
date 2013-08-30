package com.openxc.measurements;

import java.util.Locale;

import com.openxc.units.State;

/** 
 * The EngineMode measurement tells the current EV engine mode
 */
public class EngineMode extends BaseMeasurement<State<EngineMode.EngineModes>> {
	public final static String ID = "engine_mode";
	
	public enum EngineModes {
		NO_PREF,
		EV_DRIVING,
		CHARGE_DEPLETING,
		CHARGE_SUSTAINING,
		CHARGE_DEPLETING_ENGINE_ON,
		CHARGE_SUSTAINING_ENGINE_ON
	}
	
	public EngineMode(State<EngineModes> value) {
		super(value);
	}

	public EngineMode(EngineModes value) {
		this(new State<EngineModes>(value));
	}
    public EngineMode(String value) {
        this(EngineModes.valueOf(value.toUpperCase(Locale.US)));
    }
	
    @Override
    public String getGenericName() {
        return ID;
    }
}
