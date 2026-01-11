package ElevatorSystem;

public class Display {
    int floor;
    Direction direction;

    public void update(int floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
    }

    public void showDisplay() {
        System.out.println("FLOOR: " + floor);
        System.out.println("DIRECTION: " + direction);
    }
}
