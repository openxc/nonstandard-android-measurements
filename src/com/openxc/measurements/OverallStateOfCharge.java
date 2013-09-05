package com.openxc.measurements;

import com.openxc.units.Percentage;
import com.openxc.util.Range;

/**
 * The OverallStateOfCharge is the percent state of charge of the whole system
 */
public class OverallStateOfCharge extends BaseMeasurement<Percentage> {
    private final static Range<Percentage> RANGE =
        new Range<Percentage>(new Percentage(0), new Percentage(100));
    public final static String ID = "overall_state_of_charge";

    public OverallStateOfCharge(Number value) {
        super(new Percentage(value), RANGE);
    }

    public OverallStateOfCharge(Percentage value) {
        super(value, RANGE);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
