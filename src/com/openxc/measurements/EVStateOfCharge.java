package com.openxc.measurements;

import com.openxc.units.Percentage;
import com.openxc.util.Range;

/**
 * The EVStateOfCharge is the percent state of charge of the EV system
 */
public class EVStateOfCharge extends BaseMeasurement<Percentage> {
    private final static Range<Percentage> RANGE =
        new Range<Percentage>(new Percentage(0), new Percentage(100));
    public final static String ID = "ev_state_of_charge";

    public EVStateOfCharge(Number value) {
        super(new Percentage(value), RANGE);
    }

    public EVStateOfCharge(Percentage value) {
        super(value, RANGE);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
