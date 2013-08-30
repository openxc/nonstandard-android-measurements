package com.openxc.measurements;

import java.util.Locale;
import com.openxc.units.State;

public class TirePressFLStatus extends BaseMeasurement<State<TirePressFLStatus.TireStatus>> 
{
	public final static String ID = "tire_pressure_front_left_status";
	
	public enum TireStatus {
		NORMAL,
		LOW
	}
	
	public TirePressFLStatus(State<TireStatus> value) {
	    super(value);
	}
	
	public TirePressFLStatus(TireStatus value) {
	    this(new State<TireStatus>(value));
	}
	
	public TirePressFLStatus(String value) {
	    this(TireStatus.valueOf(value.toUpperCase(Locale.US)));
	}
	
	@Override
	public String getGenericName() {
	    return ID;
	}
}
