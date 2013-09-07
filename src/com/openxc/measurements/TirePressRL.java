package com.openxc.measurements;

import com.openxc.units.PSI;
import com.openxc.util.Range;

public class TirePressRL extends BaseMeasurement<PSI> {
    private final static Range<PSI> RANGE = new Range<PSI>(
            new PSI(0), new PSI(252));
    public final static String ID = "tire_pressure_rear_left";

    public TirePressRL(PSI value) {
        super(value, RANGE);
    }

    public TirePressRL(Number value) {
        this(new PSI(value));
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
