package com.openxc.measurements;

import java.util.Locale;

import com.openxc.units.State;
import com.openxc.units.KeylessEntryCode;

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

    public KeylessEntryProgrammingCommand(String command, String code) {
        this(Command.valueOf(command.toUpperCase(Locale.US)), code);
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
