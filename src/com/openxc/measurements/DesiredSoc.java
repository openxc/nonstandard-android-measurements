package com.openxc.measurements;

import com.openxc.units.Percentage;
import com.openxc.util.Range;

/**
 * The DesiredSoc is the requested percent state of charge of the HV battery 
 */
public class DesiredSoc extends BaseMeasurement<Percentage> {
    private final static Range<Percentage> RANGE =
        new Range<Percentage>(new Percentage(0), new Percentage(100));
    public final static String ID = "desired_soc";

    public DesiredSoc(Number value) {
        super(new Percentage(value), RANGE);
    }

    public DesiredSoc(Percentage value) {
        super(value, RANGE);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
