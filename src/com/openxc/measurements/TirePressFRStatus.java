package com.openxc.measurements;

import java.util.Locale;
import com.openxc.units.State;

public class TirePressFRStatus extends BaseMeasurement<State<TirePressFRStatus.TireStatus>> 
{
	public final static String ID = "tire_pressure_front_right_status";
	
	public enum TireStatus {
		NORMAL,
		LOW
	}
	
	public TirePressFRStatus(State<TireStatus> value) {
	    super(value);
	}
	
	public TirePressFRStatus(TireStatus value) {
	    this(new State<TireStatus>(value));
	}
	
	public TirePressFRStatus(String value) {
	    this(TireStatus.valueOf(value.toUpperCase(Locale.US)));
	}
	
	@Override
	public String getGenericName() {
	    return ID;
	}
}