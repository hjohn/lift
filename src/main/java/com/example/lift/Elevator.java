package com.example.lift;

/**
 * A simple elevator.
 */
public class Elevator {
    private int currentFloorIndex;
    private boolean doorsOpen;

    /**
     * Returns the index of the current floor.
     *
     * @return the index of the current floor
     */
    public int getCurrentFloorIndex() {
        return currentFloorIndex;
    }

    /**
     * Moves the elevator one floor up.
     */
    public void up() {
        if(doorsOpen) {
            throw new IllegalStateException("Doors are open");
        }

        currentFloorIndex++;
    }

    /**
     * Moves the elevator one floor down.
     */
    public void down() {
        if(doorsOpen) {
            throw new IllegalStateException("Doors are open");
        }

        currentFloorIndex--;
    }

    /**
     * Opens the elevator doors.
     */
    public void openDoors() {
        if(doorsOpen) {
            throw new IllegalStateException("Doors are already open");
        }

        this.doorsOpen = true;
    }

    /**
     * Closes the elevator doors.
     */
    public void closeDoors() {
        if(!doorsOpen) {
            throw new IllegalStateException("Doors are already closed");
        }

        this.doorsOpen = false;
    }

    /**
     * Returns <code>true</code> if the doors are open, otherwise <code>false</code>
     * @return <code>true</code> if the doors are open, otherwise <code>false</code>
     */
    public boolean areDoorsOpen() {
        return doorsOpen;
    }

    /**
     * Returns the highest floor possible.
     *
     * @return the highest floor possible
     */
    public int getMaxFloor() {
        return 10;
    }

    /**
     * Returns the lowest floor possible.
     *
     * @return the lowest floor possible
     */
    public int getMinFloor() {
        return -1;
    }
}
