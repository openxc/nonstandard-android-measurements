package com.openxc.measurements;

import com.openxc.units.Boolean;

/**
 * The AirConditioningStatus measurement knows if the AC is turned on 
 */
public class AirConditioningStatus extends BaseMeasurement<Boolean> {
	public final static String ID = "air_conditioning_status";

    public AirConditioningStatus(Boolean value) {
        super(value);
    }

    public AirConditioningStatus(java.lang.Boolean value) {
        this(new Boolean(value));
    }

    @Override
    public String getGenericName() {
        return ID;
    }	

}
