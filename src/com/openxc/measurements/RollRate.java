package com.openxc.measurements;

import com.openxc.units.DegreesPerSecond;
import com.openxc.util.Range;

/**
 * The RollRate is a measure of angular velocity of the vehicle around the roll
 * axis.
 */
public class RollRate extends BaseMeasurement<DegreesPerSecond> {
    private final static Range<DegreesPerSecond> RANGE =
        new Range<DegreesPerSecond>(new DegreesPerSecond(0.0),
                new DegreesPerSecond(655.0));
    public final static String ID = "roll_rate";

    public RollRate(DegreesPerSecond value) {
        super(value, RANGE);
    }

    public RollRate(Number value) {
        this(new DegreesPerSecond(value));
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
