package com.openxc.units;

import com.google.common.base.Objects;

public class KeylessEntryCode extends Unit {
    private String mCode;

    public KeylessEntryCode(String code) {
        mCode = code;
    }

    public String getSerializedValue() {
        return mCode;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
            .add("code", mCode)
            .toString();
    }
}
