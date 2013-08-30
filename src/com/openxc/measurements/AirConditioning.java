package com.openxc.measurements;

import java.util.Locale;

import com.openxc.units.State;

/** 
 * The AirConditioning measurement controls the air conditioning. 
 */
public class AirConditioning extends BaseMeasurement<State<AirConditioning.ACCommands>> {
	public final static String ID = "climate_ac";
	
	public enum ACCommands {
		OFF,
		ON,
		AUTO,
		LAST_USER_SETTING
	}
	public AirConditioning(State<ACCommands> value) {
		super(value);
	}

	public AirConditioning(ACCommands value) {
		this(new State<ACCommands>(value));
	}
    public AirConditioning(String value) {
        this(ACCommands.valueOf(value.toUpperCase(Locale.US)));
    }
	
    @Override
    public String getGenericName() {
        return ID;
    }
}
