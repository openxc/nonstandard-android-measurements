package com.openxc.measurements;

import java.util.Locale;

import com.openxc.units.State;

/** 
 * The ClimateMode measurement is used to start the AC/Heater/Fan 
 */
public class ClimateMode extends BaseMeasurement<State<ClimateMode.ClimateControls>> {
	public final static String ID = "climate_mode";
	
	public enum ClimateControls {
		OFF,
		PANEL_VENT,
		PANEL_FLOOR,
		FLOOR,
		FAN_SPEED_INCREMENT,
		FAN_SPEED_DECREMENT,
		AUTO,
		MAX_AC,
		RECIRCULATION,
		FRONT_DEFROST,
		REAR_DEFROST,
		MAX_DEFROST
	}

	public ClimateMode(State<ClimateControls> value) {
		super(value);
	}

	public ClimateMode(ClimateControls value) {
		this(new State<ClimateControls>(value));
	}
    public ClimateMode(String value) {
        this(ClimateControls.valueOf(value.toUpperCase(Locale.US)));
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
