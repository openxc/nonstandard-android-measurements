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
		MAX_AC,
		PANEL_VENT,
		FLOOR,
		WINDSHIELD_FLOOR,
		WINDSHIELD_DEFROST,
		WINDSHIELD_PANEL,
		WINDSHIELD_PANEL_FLOOR,
		MAX_DEFROST,
		AUTO,
		LAST_USER_SETTING,
		NOT_USED
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