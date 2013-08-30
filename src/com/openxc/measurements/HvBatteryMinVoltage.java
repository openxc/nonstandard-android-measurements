package com.openxc.measurements;

import com.openxc.units.Volt;
import com.openxc.util.Range;

/**
 * Lower Voltage limit of HV battery
 * The valid range for this measurement is from 0 to 510 Volts.
 */
public class HvBatteryMinVoltage extends BaseMeasurement<Volt> {
    private final static Range<Volt> RANGE =
        new Range<Volt>(new Volt(0), new Volt(510));

    public final static String ID = "hv_battery_min_voltage";

    public HvBatteryMinVoltage(Number value) {
        super(new Volt(value), RANGE);
    }
    public HvBatteryMinVoltage(Volt value) {
        super(value, RANGE);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
