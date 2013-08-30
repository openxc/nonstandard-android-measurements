package com.openxc.measurements;

import com.openxc.units.Boolean;

public class VehicleWakeCommand extends BaseMeasurement<Boolean> {
    public final static String ID = "vehicle_wake_command";

    public VehicleWakeCommand(Boolean value) {
        super(value);
    }

    public VehicleWakeCommand(java.lang.Boolean value) {
        this(new Boolean(value));
    }

    @Override
    public java.lang.Boolean getSerializedValue() {
        return new java.lang.Boolean(getValue().booleanValue());
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
