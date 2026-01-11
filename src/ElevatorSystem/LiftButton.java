package ElevatorSystem;

public class LiftButton implements Button {

    private int destinationFloor;
    private ElevatorCar elevatorCar;
    private ElevatorController elevatorController;

    public LiftButton(int destinationFloor, ElevatorCar elevatorCar, ElevatorController elevatorController) {
        this.destinationFloor = destinationFloor;
        this.elevatorCar = elevatorCar;
        this.elevatorController = elevatorController;
    }

    @Override
    public void press() {
        elevatorController.handleRequest(
                new Request(elevatorCar.getCurrentFloor(), destinationFloor, elevatorCar.getDirection()));
    }
}
