package com.openxc.measurements;

import java.util.Locale;

import com.openxc.units.KeylessEntryCode;
import com.openxc.units.State;

public class KeylessEntryProgrammingCommand extends BaseMeasurement<
        State<KeylessEntryProgrammingCommand.Command>> {
    public final static String ID = "keyless_entry_command";

    public enum Command {
        ADD,
        ERASE,
        AUTHENTICATE
    }

    public KeylessEntryProgrammingCommand(State<Command> command,
            KeylessEntryCode code) {
        super(command, code);
    }

    public KeylessEntryProgrammingCommand(Command command,
            String code) {
        super(new State<Command>(command), new KeylessEntryCode(code));
    }

    public KeylessEntryProgrammingCommand(Command command) {
        super(new State<Command>(command));
    }

    public KeylessEntryProgrammingCommand(String command, String code) {
        this(Command.valueOf(command.toUpperCase(Locale.US)), code);
    }

    public KeylessEntryProgrammingCommand(String command) {
        this(Command.valueOf(command.toUpperCase(Locale.US)));
    }

    @Override
    public String getSerializedValue() {
        return getValue().enumValue().toString().toLowerCase();
    }

    @Override
    public KeylessEntryCode getEvent() {
        return (KeylessEntryCode) super.getEvent();
    }

    @Override
    public String getSerializedEvent() {
        return getEvent() != null ? getEvent().getSerializedValue() : null;
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
