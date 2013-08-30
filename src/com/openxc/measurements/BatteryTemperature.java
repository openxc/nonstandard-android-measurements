package com.openxc.measurements;

import com.openxc.units.Degree;
import com.openxc.util.Range;

/**
 * The BatteryTemperature measurement is the actual temperature of the HV battery
 *
 * The valid range for this measurement is from -50 to 460.5 Degrees.
 */
public class BatteryTemperature extends BaseMeasurement<Degree> {
    private final static Range<Degree> RANGE =
        new Range<Degree>(new Degree(-50), new Degree(460.5));

    public final static String ID = "battery_temperature";

    public BatteryTemperature(Number value) {
        super(new Degree(value), RANGE);
    }
    public BatteryTemperature(Degree value) {
        super(value, RANGE);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
