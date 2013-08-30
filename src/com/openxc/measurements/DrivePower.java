package com.openxc.measurements;

import com.openxc.units.Watt;

/**
 * The DrivePower is the current drive power level
 */
public class DrivePower extends BaseMeasurement<Watt> {
    public final static String ID = "drive_power";

    public DrivePower(Number value) {
        super(new Watt(value));
    }

    public DrivePower(Watt value) {
        super(value);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
