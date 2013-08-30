package com.openxc.measurements;

import com.openxc.units.Watt;

/**
 * The EnginePower is the current engine power in Watts 
 */
public class EnginePower extends BaseMeasurement<Watt> {
    public final static String ID = "engine_power";

    public EnginePower(Number value) {
        super(new Watt(value));
    }

    public EnginePower(Watt value) {
        super(value);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
