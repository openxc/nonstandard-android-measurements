package com.openxc.measurements;

import com.openxc.units.PoundsPerSquareInch;
import com.openxc.units.State;

// TODO unfortunately we can't enforce the type of the 'event' in the template
// (i.e. PoundsPerSquareInch), so the range has no effect
public class TirePressure extends BaseMeasurement<State<TirePressure.Tire>> {
    public final static String ID = "tire_pressure";

    public enum Tire {
        FRONT_LEFT,
        FRONT_RIGHT,
        REAR_LEFT,
        REAR_RIGHT
    }

    public TirePressure(State<Tire> tire, PoundsPerSquareInch pressure) {
        super(tire, pressure);
    }

    public TirePressure(Tire tire, PoundsPerSquareInch pressure) {
        this(new State<Tire>(tire), pressure);
    }

    public TirePressure(Tire tire, Number value) {
        this(tire, new PoundsPerSquareInch(value));
    }

    @Override
    public String getSerializedValue() {
        return getValue().enumValue().toString().toLowerCase();
    }

    @Override
    public PoundsPerSquareInch getEvent() {
        return (PoundsPerSquareInch) super.getEvent();
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
