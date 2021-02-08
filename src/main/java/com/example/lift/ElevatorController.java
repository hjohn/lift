package com.example.lift;

/**
 * A simple controller for an elevator.
 */
public interface ElevatorController {

    /**
     * Moves the controlled elevator to the given floor.  Closes the doors if necessary.
     *
     * @param floor a floor
     * @throws IllegalArgumentException if floor is out of range
     */
    void gotoFloor(int floor);

    /**
     * Returns the current floor number
     *
     * @return the current floor number
     */
    int getCurrentFloor();
}
