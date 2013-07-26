package com.openxc.measurements;

import com.openxc.units.RgbColor;

public class AmbientLightColorCommand
        extends BaseMeasurement<RgbColor> {
    public final static String ID = "custom_ambient_light_color";

    public AmbientLightColorCommand(RgbColor value) {
        super(value);
    }

    public AmbientLightColorCommand(int red, int green, int blue) {
        this(new RgbColor(red, green, blue));
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
