package com.openxc.measurements;

import com.openxc.units.Level;
import com.openxc.util.Range;

/**
 * The ClimateFanSpeed measurement is for setting the fan speed from 0 - 9
 * 0 is min speed 
 * 7 is max speed
 * 8 is auto
 * 9 is last user setting
 * This may be better handled with a State based signal but I wanted 
 * to experiment a bit with this method.
 */
public class ClimateFanSpeed extends BaseMeasurement<Level> {
    private final static Range<Level> RANGE =
        new Range<Level>(new Level(0), new Level(9));

    public final static String ID = "climate_fan_speed";

    public ClimateFanSpeed(Number value) {
        super(new Level(value), RANGE);
    }
    public ClimateFanSpeed(Level value) {
        super(value, RANGE);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
