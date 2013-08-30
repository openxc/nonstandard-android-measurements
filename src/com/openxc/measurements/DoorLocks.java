package com.openxc.measurements;

import java.util.Locale;

import com.openxc.units.State;

/** 
 * The DoorLocks measurement can be used to request doors be locked or unlocked 
 */
public class DoorLocks extends BaseMeasurement<State<DoorLocks.LockCommands>> {
	public final static String ID = "door_locks";
	
	public enum LockCommands {
		UNLOCK_ALL,
		LOCK_ALL
	}
	public DoorLocks(State<LockCommands> value) {
		super(value);
	}

	public DoorLocks(LockCommands value) {
		this(new State<LockCommands>(value));
	}
    public DoorLocks(String value) {
        this(LockCommands.valueOf(value.toUpperCase(Locale.US)));
    }
	
    @Override
    public String getGenericName() {
        return ID;
    }
}
