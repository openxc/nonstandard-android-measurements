package com.openxc.measurements;

import java.util.Locale;

import com.openxc.units.State;

/** 
 * The FreshAirVent measurement is for opening the fresh air vent to let air in
 * or for closing the vent to recirculate cabin air 
 */
public class FreshAirVent extends BaseMeasurement<State<FreshAirVent.VentModes>> {
	public final static String ID = "climate_recirculating";
	
	public enum VentModes {
		OUTSIDE,
		RECIRCULATING,
		AUTO,
		LAST_USER_VALUE
	}
	public FreshAirVent(State<VentModes> value) {
		super(value);
	}

	public FreshAirVent(VentModes value) {
		this(new State<VentModes>(value));
	}
    public FreshAirVent(String value) {
        this(VentModes.valueOf(value.toUpperCase(Locale.US)));
    }
	
    @Override
    public String getGenericName() {
        return ID;
    }
}
