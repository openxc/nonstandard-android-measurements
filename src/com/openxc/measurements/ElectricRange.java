package com.openxc.measurements;

import com.openxc.units.Kilometer;
import com.openxc.util.Range;

/**
 * The ElectricRange measurement is the pure electric range.
 *
 * The valid range for this measurement is from 0 to 409.3 Kilometers.
 */
public class ElectricRange extends BaseMeasurement<Kilometer> {
    private final static Range<Kilometer> RANGE =
        new Range<Kilometer>(new Kilometer(0), new Kilometer(409.3));

    public final static String ID = "electric_range";

    public ElectricRange(Number value) {
        super(new Kilometer(value), RANGE);
    }
    public ElectricRange(Kilometer value) {
        super(value, RANGE);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
