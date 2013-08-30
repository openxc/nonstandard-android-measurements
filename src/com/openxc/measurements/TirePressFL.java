package com.openxc.measurements;

import com.openxc.units.PSI;
import com.openxc.util.Range;

public class TirePressFL extends BaseMeasurement<PSI> {
    private final static Range<PSI> RANGE = new Range<PSI>(
            new PSI(0), new PSI(252));
    public final static String ID = "tire_pressure_front_left";

    public TirePressFL(PSI value) {
        super(value, RANGE);
    }

    public TirePressFL(Number value) {
        this(new PSI(value));
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
