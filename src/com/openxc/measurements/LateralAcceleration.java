package com.openxc.measurements;

import com.openxc.units.MetersPerSecondSquared;
import com.openxc.util.Range;

/**
 * The LateralAcceleration is the lateral, or side to side, acceleration of the
 * vehicle.
 */
public class LateralAcceleration extends BaseMeasurement<MetersPerSecondSquared> {
    private final static Range<MetersPerSecondSquared> RANGE =
        new Range<MetersPerSecondSquared>(new MetersPerSecondSquared(0.0),
                new MetersPerSecondSquared(655.0));
    public final static String ID = "lateral_acceleration";

    public LateralAcceleration(MetersPerSecondSquared value) {
        super(value, RANGE);
    }

    public LateralAcceleration(Number value) {
        this(new MetersPerSecondSquared(value));
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
