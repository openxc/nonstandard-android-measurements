package com.openxc.measurements;

import com.openxc.units.MetersPerSecondSquared;
import com.openxc.util.Range;

/**
 * The LongitudinalAcceleration is the longitudinal, or front to back,
 * acceleration of the vehicle.
 */
public class LongitudinalAcceleration extends BaseMeasurement<MetersPerSecondSquared> {
    private final static Range<MetersPerSecondSquared> RANGE =
        new Range<MetersPerSecondSquared>(new MetersPerSecondSquared(0.0),
                new MetersPerSecondSquared(655.0));
    public final static String ID = "longitudinal_acceleration";

    public LongitudinalAcceleration(MetersPerSecondSquared value) {
        super(value, RANGE);
    }

    public LongitudinalAcceleration(Number value) {
        this(new MetersPerSecondSquared(value));
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
