package com.openxc.measurements;

import java.util.Locale;

import com.openxc.measurements.TirePressure.Tire;
import com.openxc.units.PoundsPerSquareInch;
import com.openxc.units.State;

public class TirePressureStatus extends BaseMeasurement<State<TirePressure.Tire>> {
    public final static String ID = "tire_pressure_status";

    public enum PressureStatus {
        LOW,
        NORMAL,
        HIGH
    }

    public TirePressureStatus(State<Tire> tire, State<PressureStatus> pressure) {
        super(tire, pressure);
    }

    public TirePressureStatus(Tire tire, PressureStatus pressure) {
        this(new State<Tire>(tire), new State<PressureStatus>(pressure));
    }

    public TirePressureStatus(Tire tire, String status) {
        this(tire, PressureStatus.valueOf(status.toUpperCase(Locale.US)));
    }

    @Override
    public String getSerializedValue() {
        return getValue().enumValue().toString().toLowerCase();
    }

    @Override
    public State<PressureStatus> getEvent() {
        return (State<PressureStatus>) super.getEvent();
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
