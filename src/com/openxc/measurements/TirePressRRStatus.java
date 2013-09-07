package com.openxc.measurements;

import java.util.Locale;
import com.openxc.units.State;

public class TirePressRRStatus extends BaseMeasurement<State<TirePressRRStatus.TireStatus>> 
{
	public final static String ID = "tire_pressure_rear_right_status";
	
	public enum TireStatus {
		NORMAL,
		LOW
	}
	
	public TirePressRRStatus(State<TireStatus> value) {
	    super(value);
	}
	
	public TirePressRRStatus(TireStatus value) {
	    this(new State<TireStatus>(value));
	}
	
	public TirePressRRStatus(String value) {
	    this(TireStatus.valueOf(value.toUpperCase(Locale.US)));
	}
	
	@Override
	public String getGenericName() {
	    return ID;
	}
}