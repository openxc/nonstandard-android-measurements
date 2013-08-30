package com.openxc.measurements;

import com.openxc.units.Level;
import com.openxc.util.Range;

/**
 * The WLEStatus measurement is an estimate of the current driver load.
 */
public class WLEStatus extends BaseMeasurement<Level> {
    private final static Range<Level> RANGE =
        new Range<Level>(new Level(0), new Level(1));
    public final static String ID = "wle_status";

    public WLEStatus(Level value) {
        super(value, RANGE);
    }

    public WLEStatus(Number value) {
        this(new Level(value));
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}