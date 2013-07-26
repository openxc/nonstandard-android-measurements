package com.openxc.units;

import com.google.common.base.Objects;

public class RgbColor extends Unit {
    private int mRed;
    private int mGreen;
    private int mBlue;

    public RgbColor(int red, int green, int blue) {
        mRed = red;
        mGreen = green;
        mBlue = blue;
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)) {
            return false;
        }

		final RgbColor other = (RgbColor) obj;
        return mRed == other.mRed && mGreen == other.mGreen &&
                mBlue == other.mBlue;
    }

    public String getSerializedValue() {
        return mRed + "," + mGreen + "," + mBlue;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
            .add("red", mRed)
            .add("green", mGreen)
            .add("blue", mBlue)
            .toString();
    }
}
