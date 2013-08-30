package com.openxc.measurements;

import com.openxc.units.Degree;
import com.openxc.util.Range;

/**
 * The ClimateTemperature measurement is used to set the desired temperature
 *
 * The valid range for this measurement is from 14.5C to 30C Degree.
 */
public class ClimateTemperature extends BaseMeasurement<Degree> {
    private final static Range<Degree> RANGE =
        new Range<Degree>(new Degree(14.5),
                new Degree(30));

    public final static String ID = "climate_temp";

    public ClimateTemperature(Number value) {
        super(new Degree(value), RANGE);
    }
    public ClimateTemperature(Degree value) {
        super(value, RANGE);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
