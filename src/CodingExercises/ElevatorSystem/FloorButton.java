package ElevatorSystem;

public class FloorButton implements Button {
    private ElevatorController elevatorController;
    private int sourceFloor;
    private Direction direction;

    public FloorButton(int sourceFloor, Direction direction, ElevatorController elevatorController) {
        this.sourceFloor = sourceFloor;
        this.direction = direction;
        this.elevatorController = elevatorController;

    }

    @Override
    public void press() {
        elevatorController.handleRequest(new Request(sourceFloor, -1, direction));
    }

}
