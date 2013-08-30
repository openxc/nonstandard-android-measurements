package com.openxc.measurements;

import com.openxc.units.Hour;
import com.openxc.util.Range;

/**
 * The ChargeTime measurement is the estimated time until fully charged.
 *
 * The valid range for this measurement is from 0 to 24 Hours.
 */
public class ChargeTime extends BaseMeasurement<Hour> {
    private final static Range<Hour> RANGE =
        new Range<Hour>(new Hour(0), new Hour(24));

    public final static String ID = "hours_until_charged";

    public ChargeTime(Number value) {
        super(new Hour(value), RANGE);
    }
    public ChargeTime(Hour value) {
        super(value, RANGE);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
