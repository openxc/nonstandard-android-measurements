package com.openxc.measurements;

import com.openxc.units.Boolean;

/**
 * RearWasherStatus Measure is true when the rear wiper/windshield washer is on 
 */

public class RearWasherStatus extends BaseMeasurement<Boolean> {
    public final static String ID = "rear_washer_splash";

    public RearWasherStatus(Boolean value) {
        super(value);
    }

    public RearWasherStatus(java.lang.Boolean value) {
        this(new Boolean(value));
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}