package com.openxc.measurements;

import java.util.Locale;

import com.openxc.units.State;

public class KeylessEntryProgrammingStatus
        extends BaseMeasurement<State<KeylessEntryProgrammingStatus.Status>> {
    public final static String ID = "keyless_entry_programming_status";

    public enum Status {
        ERASED,
        AUTHENTICATED,
        NOT_AUTHENTICATED,
        ADDED
    }

    public KeylessEntryProgrammingStatus(State<Status> value) {
        super(value);
    }

    public KeylessEntryProgrammingStatus(Status value) {
        super(new State<Status>(value));
    }

    public KeylessEntryProgrammingStatus(String value) {
        this(Status.valueOf(value.toUpperCase(Locale.US)));
    }

    @Override
    public String getSerializedValue() {
        return getValue().enumValue().toString();
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
