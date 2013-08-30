package com.openxc.measurements;

import com.openxc.units.Percentage;
import com.openxc.util.Range;

/**
 * The ActualSoc is the percent state of charge of the HV battery 
 */
public class ActualSoc extends BaseMeasurement<Percentage> {
    private final static Range<Percentage> RANGE =
        new Range<Percentage>(new Percentage(0), new Percentage(100));
    public final static String ID = "actual_soc";

    public ActualSoc(Number value) {
        super(new Percentage(value), RANGE);
    }

    public ActualSoc(Percentage value) {
        super(value, RANGE);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
