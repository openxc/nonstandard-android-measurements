package com.openxc.measurements;

import com.openxc.units.Volt;
import com.openxc.util.Range;

/**
 * The DcDcVoltage  measurement is the voltage on the high side of the DcDc converter
 *
 * The valid range for this measurement is from 0 to 510.5 Volts.
 */
public class DcDcVoltage extends BaseMeasurement<Volt> {
    private final static Range<Volt> RANGE =
        new Range<Volt>(new Volt(0), new Volt(510.5));

    public final static String ID = "dcdc_voltage";

    public DcDcVoltage(Number value) {
        super(new Volt(value), RANGE);
    }
    public DcDcVoltage(Volt value) {
        super(value, RANGE);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
