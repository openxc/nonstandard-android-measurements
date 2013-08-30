package com.openxc.measurements;

import com.openxc.units.Boolean;

/** 
 * The BeepRequest measurement can be used to request a beep from Sync
 */
public class BeepRequest extends BaseMeasurement<Boolean> {
	public final static String ID = "beep_request";
	
	public BeepRequest(Boolean value) {
		super(value);
	}

    public BeepRequest(java.lang.Boolean value) {
        this(new Boolean(value));
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
