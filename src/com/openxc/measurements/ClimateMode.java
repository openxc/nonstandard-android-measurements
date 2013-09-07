package com.openxc.measurements;

import java.util.Locale;

import com.openxc.units.State;

/** 
 * The ClimateMode measurement is used to start the AC/Heater/Fan 
 */
public class ClimateMode extends BaseMeasurement<State<ClimateMode.ClimateControls>> {
	public final static String ID = "climate_mode";
	
	public enum ClimateControls {
		UNUSED(0),
		PANEL_VENT(1),
		PANEL_FLOOR(2),
		FLOOR(3),
		FAN_SPEED_INCREMENT(11),
		FAN_SPEED_DECREMENT(12),
		AUTO(13),
		MAX_AC(14),
		RECIRCULATION(15),
		FRONT_DEFROST(16),
		REAR_DEFROST(17),
		MAX_DEFROTS(22)
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
