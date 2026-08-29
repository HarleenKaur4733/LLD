package ElevatorSystem;

public class Floor {
    private int floorNo;
    private Display display;
    private Button floorUpButton;
    private Button floorDownButton;

    public Button getUpButton() {
        return floorUpButton;
    }

    public Button getDownButton() {
        return floorDownButton;
    }

    public Floor(int floorNo, ElevatorController elevatorController) {
        this.floorNo = floorNo;
        this.floorUpButton = new FloorButton(floorNo, Direction.UP, elevatorController);
        this.floorDownButton = new FloorButton(floorNo, Direction.DOWN, elevatorController);

    }

}
