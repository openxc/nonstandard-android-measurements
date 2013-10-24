package com.openxc.measurements;

import com.openxc.units.Celsius;
import com.openxc.util.Range;

/**
 * The OutsideAirTemperature is temperature measured outside the vehicle.
 */
public class OutsideAirTemperature extends BaseMeasurement<Celsius> {
    private final static Range<Celsius> RANGE =
        new Range<Celsius>(new Celsius(0), new Celsius(4294967295.0));
    public final static String ID = "outside_air_temperature";

    public OutsideAirTemperature(Number value) {
        super(new Celsius(value), RANGE);
    }

    public OutsideAirTemperature(Celsius value) {
        super(value, RANGE);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
