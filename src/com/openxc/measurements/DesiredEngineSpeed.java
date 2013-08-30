package com.openxc.measurements;

import com.openxc.units.RotationsPerMinute;

/**
 * The DesiredEngineSpeed measurement represents the requested speed of the engine.
 *
 */
public class DesiredEngineSpeed extends BaseMeasurement<RotationsPerMinute> {
    public final static String ID = "desired_eng_speed";

    public DesiredEngineSpeed(Number value) {
        super(new RotationsPerMinute(value));
    }
    public DesiredEngineSpeed(RotationsPerMinute value) {
        super(value);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
