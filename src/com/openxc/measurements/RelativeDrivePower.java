package com.openxc.measurements;

import com.openxc.units.Percentage;
import com.openxc.util.Range;

/**
 * The RelativeDrivePower is the current drive power level
 */
public class RelativeDrivePower extends BaseMeasurement<Percentage> {
    private final static Range<Percentage> RANGE =
        new Range<Percentage>(new Percentage(-102.2), new Percentage(102.4));
    public final static String ID = "relative_drive_power";

    public RelativeDrivePower(Number value) {
        super(new Percentage(value), RANGE);
    }

    public RelativeDrivePower(Percentage value) {
        super(value, RANGE);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
