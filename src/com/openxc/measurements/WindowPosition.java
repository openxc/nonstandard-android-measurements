package com.openxc.measurements;

import com.openxc.units.Percentage;
import com.openxc.units.State;

// TODO unfortunately we can't enforce the type of the 'event' in the template
// (i.e. Percentage), so the range has no effect
public class WindowPosition extends BaseMeasurement<State<WindowPosition.Window>> {
    public final static String ID = "window_position";

    public enum Window {
        FRONT_DRIVER,
        REAR_DRIVER,
        FRONT_PASSENGER,
        REAR_PASSENGER
    }

    public WindowPosition(State<Window> tire, Percentage pressure) {
        super(tire, pressure);
    }

    public WindowPosition(Window tire, Percentage pressure) {
        this(new State<Window>(tire), pressure);
    }

    public WindowPosition(Window tire, Number value) {
        this(tire, new Percentage(value));
    }

    @Override
    public String getSerializedValue() {
        return getValue().enumValue().toString().toLowerCase();
    }

    @Override
    public Percentage getEvent() {
        return (Percentage) super.getEvent();
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
