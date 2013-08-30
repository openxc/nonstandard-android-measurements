package com.openxc.measurements;

import com.openxc.units.Percentage;
import com.openxc.util.Range;

/**
 * The CustomerSoc is the max percent state of charge of the HV battery 
 */
public class CustomerSoc extends BaseMeasurement<Percentage> {
    private final static Range<Percentage> RANGE =
        new Range<Percentage>(new Percentage(0), new Percentage(100));
    public final static String ID = "customer_soc";

    public CustomerSoc(Number value) {
        super(new Percentage(value), RANGE);
    }

    public CustomerSoc(Percentage value) {
        super(value, RANGE);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
