package com.openxc.measurements;

import com.openxc.units.Level;
import com.openxc.util.Range;

/**
 * The VolumeSet measurement allows you to adjust the stereo volume in steps
 * 
 * The step size is proportional to the value passed.  
 * Negative values will decrease volume and Positive increase.
 * 
 */
public class VolumeSet extends BaseMeasurement<Level> {
	private final static String ID = "set_volume";
	private final static Range<Level> RANGE = new Range<Level>(new Level(-30), new Level(30));
	
	public VolumeSet(Number value) {
		super(new Level(value), RANGE);
	}
	
	public VolumeSet(Level value) {
		super(value, RANGE);
	}
	
    @Override
    public String getGenericName() {
        return ID;
    }
}
