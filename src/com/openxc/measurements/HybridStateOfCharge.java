package com.openxc.measurements;

import com.openxc.units.Percentage;
import com.openxc.util.Range;

/**
 * The HybridStateOfCharge is the percent state of charge of the hybrid system
 */
public class HybridStateOfCharge extends BaseMeasurement<Percentage> {
    private final static Range<Percentage> RANGE =
        new Range<Percentage>(new Percentage(0), new Percentage(100));
    public final static String ID = "hybrid_state_of_charge";

    public HybridStateOfCharge(Number value) {
        super(new Percentage(value), RANGE);
    }

    public HybridStateOfCharge(Percentage value) {
        super(value, RANGE);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
