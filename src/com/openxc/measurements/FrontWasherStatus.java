package com.openxc.measurements;

import com.openxc.units.Boolean;

/**
 * FrontWasherStatus Measure is true when the wiper/windshield washer is on 
 */
public class FrontWasherStatus extends BaseMeasurement<Boolean> {
    public final static String ID = "front_washer_splash";

    public FrontWasherStatus(Boolean value) {
        super(value);
    }

    public FrontWasherStatus(java.lang.Boolean value) {
        this(new Boolean(value));
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
