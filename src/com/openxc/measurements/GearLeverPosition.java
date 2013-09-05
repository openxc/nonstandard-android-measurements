package com.openxc.measurements;

import java.util.Locale;

import com.openxc.units.State;

/**
 * The GearLeverPosition is the current shifter position
 */
public class GearLeverPosition
        extends BaseMeasurement<State<GearLeverPosition.GearPosition>> {
    public final static String ID = "gear_lever_position";

    public enum GearPosition {
        PARK,
        REVERSE,
        NEUTRAL,
        DRIVE,
        SPORT,
        LOW,
        FIRST,
        SECOND,
        THIRD,
        FOURTH,
        FIFTH,
        SIXTH
    }

    public GearLeverPosition(State<GearPosition> value) {
        super(value);
    }

    public GearLeverPosition(GearPosition value) {
        this(new State<GearPosition>(value));
    }

    public GearLeverPosition(String value) {
        this(GearPosition.valueOf(value.toUpperCase(Locale.US)));
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
