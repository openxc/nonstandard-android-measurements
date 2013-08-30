package com.openxc.measurements;

import com.openxc.units.Percentage;
import com.openxc.util.Range;

/**
 * The RelativeEnginePower is the current engine power level
 */
public class RelativeEnginePower extends BaseMeasurement<Percentage> {
    private final static Range<Percentage> RANGE =
        new Range<Percentage>(new Percentage(-102.2), new Percentage(102.3));
    public final static String ID = "relative_engine_power";

    public RelativeEnginePower(Number value) {
        super(new Percentage(value), RANGE);
    }

    public RelativeEnginePower(Percentage value) {
        super(value, RANGE);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
