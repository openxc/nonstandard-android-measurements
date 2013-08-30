package com.openxc.measurements;

import com.openxc.units.Boolean;

/**
 *  Cruise control command Measurement
 *  This measurement works essentially the same as sending a state based  
 *  message but instead of setting the state you are setting the command.
 *  
 *  The value sent is always true.  You could send false but it wouldn't have 
 *  any affect on the car.
 */
public class CruiseControl extends BaseMeasurement<Boolean> {
    public String ID = "cruise_on";

    public enum CruiseCommands {
    	ON,
    	OFF,
    	CANCEL,
    	RESUME,
    	SET,
    	INCREMENT,
    	DECREMENT
    }
    
    public CruiseControl(Boolean value) {
        super(value);
    }
    public CruiseControl(java.lang.Boolean value) {
        this(new Boolean(value));
    }
   
    public CruiseControl(CruiseCommands type) {
    	super(new Boolean(true));
    	this.setCommand(type);
    }
    
    /* nonstandard method for sending the proper command. */
    public boolean setCommand(CruiseCommands command) {
    	switch(command) {
    	case ON:
    		this.ID = "cruise_on";
    		break;
    	case OFF:
    		this.ID = "cruise_off";
    		break;
    	case CANCEL:
    		this.ID = "cruise_cancel";
    		break;
    	case RESUME:
    		this.ID = "cruise_resume";
    		break;
    	case SET:
    		this.ID = "cruise_set";
    		break;
    	case INCREMENT:
    		this.ID = "cruise_increment";
    		break;
    	case DECREMENT:
    		this.ID = "cruise_decrement";
    		break;
   		default:
   			return false;
    	}
    	return true;
    }

    @Override
    public String getGenericName() {
        return ID;
    }

}
