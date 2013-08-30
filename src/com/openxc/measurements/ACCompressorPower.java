package com.openxc.measurements;

import com.openxc.units.Watt;

/**
 * The ACCompressorPower is the current A/C Compressor input power in Watts 
 */
public class ACCompressorPower extends BaseMeasurement<Watt> {
    public final static String ID = "ac_compressor_power";

    public ACCompressorPower(Number value) {
        super(new Watt(value));
    }

    public ACCompressorPower(Watt value) {
        super(value);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
