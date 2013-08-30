package com.openxc.measurements;

import com.openxc.units.Ampere;
import com.openxc.util.Range;

/**
 * The DcDcCurrent measurement is the current used for energy management
 *
 * The valid range for this measurement is from 0 to 25.4 Amperes.
 */
public class DcDcCurrent extends BaseMeasurement<Ampere> {
    private final static Range<Ampere> RANGE =
        new Range<Ampere>(new Ampere(0), new Ampere(25.4));

    public final static String ID = "dcdc_current";

    public DcDcCurrent(Number value) {
        super(new Ampere(value), RANGE);
    }
    public DcDcCurrent(Ampere value) {
        super(value, RANGE);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
