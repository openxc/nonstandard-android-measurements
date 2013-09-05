package com.openxc.measurements;

import com.openxc.units.Boolean;

/**
 * HeaterStatus Measure is true when the  heater is on
 */

public class HeaterStatus extends BaseMeasurement<Boolean> {
    public final static String ID = "heater_status";

    public HeaterStatus(Boolean value) {
        super(value);
    }

    public HeaterStatus(java.lang.Boolean value) {
        this(new Boolean(value));
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
