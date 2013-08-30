package com.openxc.measurements;

import com.openxc.units.Boolean;

/**
 * The ChargingPlugStatus measurement knows if the car is plugged in 
 */
public class ChargingPlugStatus extends BaseMeasurement<Boolean> {
    public final static String ID = "charging_plug_status";

    public ChargingPlugStatus(Boolean value) {
        super(value);
    }

    public ChargingPlugStatus(java.lang.Boolean value) {
        this(new Boolean(value));
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
