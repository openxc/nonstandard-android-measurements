package com.openxc.measurements;

import com.openxc.units.DegreesPerSecond;
import com.openxc.util.Range;

/**
 * The YawRate is a measure of angular velocity of the vehicle around the yaw
 * axis.
 */
public class YawRate extends BaseMeasurement<DegreesPerSecond> {
    private final static Range<DegreesPerSecond> RANGE =
        new Range<DegreesPerSecond>(new DegreesPerSecond(0.0),
                new DegreesPerSecond(655.0));
    public final static String ID = "yaw_rate";

    public YawRate(DegreesPerSecond value) {
        super(value, RANGE);
    }

    public YawRate(Number value) {
        this(new DegreesPerSecond(value));
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
