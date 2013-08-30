package com.openxc.measurements;

import java.util.Locale;

import com.openxc.units.State;

/** 
 * The ChargingStatus measurement gives the current charging status
 */
public class ChargingStatus extends BaseMeasurement<State<ChargingStatus.ChargeStatusTypes>> {
	public final static String ID = "charging_status";
	
	public enum ChargeStatusTypes {
		NOT_CHARGING,
		CHARGING,
		SCHEDULED,
		CHARGED
	}
	
	public ChargingStatus(State<ChargeStatusTypes> value) {
		super(value);
	}

	public ChargingStatus(ChargeStatusTypes value) {
		this(new State<ChargeStatusTypes>(value));
	}
    public ChargingStatus(String value) {
        this(ChargeStatusTypes.valueOf(value.toUpperCase(Locale.US)));
    }
	
    @Override
    public String getGenericName() {
        return ID;
    }
}
