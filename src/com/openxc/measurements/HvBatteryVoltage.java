package com.openxc.measurements;

import com.openxc.units.Volt;
import com.openxc.util.Range;

/**
 * Current voltage of HV Battery
 * The valid range for this measurement is from 0 to 510 Volts.
 */
public class HvBatteryVoltage extends BaseMeasurement<Volt> {
    private final static Range<Volt> RANGE =
        new Range<Volt>(new Volt(0), new Volt(510));

    public final static String ID = "hv_battery_voltage";

    public HvBatteryVoltage(Number value) {
        super(new Volt(value), RANGE);
    }
    public HvBatteryVoltage(Volt value) {
        super(value, RANGE);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
