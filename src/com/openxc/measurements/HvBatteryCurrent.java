package com.openxc.measurements;

import com.openxc.units.Ampere;
import com.openxc.util.Range;

/**
 * The HvBatteryCurrent measurement is the total current flow into or out of 
 * the HV battery.  Discharge is negative, Charge positive.
 *
 * The valid range for this measurement is from -750 to 888.25 Amperes.
 */
public class HvBatteryCurrent extends BaseMeasurement<Ampere> {
    private final static Range<Ampere> RANGE =
        new Range<Ampere>(new Ampere(-750), new Ampere(888.25));

    public final static String ID = "hv_battery_current";

    public HvBatteryCurrent(Number value) {
        super(new Ampere(value), RANGE);
    }
    public HvBatteryCurrent(Ampere value) {
        super(value, RANGE);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
