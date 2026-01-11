package ElevatorSystem;

import java.util.LinkedList;
import java.util.Queue;

public class ElevatorCar {

    private Direction direction = Direction.IDLE;
    private int currentFloor;
    private Display display;

    private Queue<Integer> stops = new LinkedList<>();

    public Display getDisplay() {
        return new Display();
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void addStops(int floor) {
        stops.add(floor);
    }

    // ElevatorCar is a dumb obj, it will only move
    // How? that algo will be decided by ElevatorController
    public void move() {
        if (stops.isEmpty()) {
            direction = Direction.IDLE;
            return;
        }

        int nextStop = stops.poll();
        direction = nextStop > currentFloor ? Direction.UP : Direction.DOWN;
        currentFloor = nextStop;
        getDisplay().update(currentFloor, direction);
        getDisplay().showDisplay();
    }

}
