package com.openxc.measurements;

import com.openxc.units.Level;
import com.openxc.util.Range;

/**
 * VolumeSetPoint will set the volume directly to any point between 
 * minimum (0) and maximum (31)  
 */
public class VolumeSetPoint extends BaseMeasurement<Level> {
	private final static String ID = "set_point_volume";
	private final static Range<Level> RANGE = new Range<Level>(new Level(0.0), new Level(31));
	
	public VolumeSetPoint(Number value) {
		super(new Level(value), RANGE);
	}
	
	public VolumeSetPoint(Level value) {
		super(value, RANGE);
	}
	
    @Override
    public String getGenericName() {
        return ID;
    }
}
