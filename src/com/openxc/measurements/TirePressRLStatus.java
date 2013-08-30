package com.openxc.measurements;

import java.util.Locale;
import com.openxc.units.State;

public class TirePressRLStatus extends BaseMeasurement<State<TirePressRLStatus.TireStatus>> 
{
	public final static String ID = "tire_pressure_rear_left_status";
	
	public enum TireStatus {
		NORMAL,
		LOW
	}
	
	public TirePressRLStatus(State<TireStatus> value) {
	    super(value);
	}
	
	public TirePressRLStatus(TireStatus value) {
	    this(new State<TireStatus>(value));
	}
	
	public TirePressRLStatus(String value) {
	    this(TireStatus.valueOf(value.toUpperCase(Locale.US)));
	}
	
	@Override
	public String getGenericName() {
	    return ID;
	}
}