
package com.openxc.measurements;

import com.openxc.units.Percentage;
import com.openxc.util.Range;

public class WindowPosRearPass extends BaseMeasurement<Percentage> {
    private final static Range<Percentage> RANGE = new Range<Percentage>(new Percentage(0), new Percentage(100));
    public final static String ID = "window_position_rear_passenger";

    public WindowPosRearPass(Number value) {
        super(new Percentage(value), RANGE);
    }

    public WindowPosRearPass(Percentage value) {
        super(value, RANGE);
    }

    @Override
    public String getGenericName() {
        return ID;
    }

}
