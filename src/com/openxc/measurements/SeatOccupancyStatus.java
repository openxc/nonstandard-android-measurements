package com.openxc.measurements;

import java.util.Locale;

import com.openxc.units.State;

/**
 * A SeatOccupancyStatus represents the occupancy status of a seat.
 */
public class SeatOccupancyStatus
        extends BaseMeasurement<State<SeatOccupancyStatus.SeatId>> {
    public final static String ID = "occupancy_status";

    /**
     * The SeatId is the specific seat in the vehicle.
     */
    public enum SeatId {
        DRIVER,
        PASSENGER,
        REAR_LEFT,
        REAR_RIGHT
    }

    public enum Occupancy {
        EMPTY,
        CHILD,
        ADULT
    }

    public SeatOccupancyStatus(State<SeatId> value, State<Occupancy> event) {
        super(value, event);
    }

    public SeatOccupancyStatus(SeatId value, Occupancy event) {
        this(new State<SeatId>(value), new State<Occupancy>(event));
    }

    public SeatOccupancyStatus(String value, String event) {
        this(SeatId.valueOf(value.toUpperCase(Locale.US)),
                Occupancy.valueOf(event.toUpperCase(Locale.US)));
    }

    @SuppressWarnings("unchecked")
    @Override
    public State<Occupancy> getEvent() {
        return (State<Occupancy>) super.getEvent();
    }

    @Override
    public String getSerializedEvent() {
        return getEvent().enumValue().toString();
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
