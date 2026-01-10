package ElevatorSystem;

public class Request {
    int sourceFloor;
    int destinationFloor;
    Direction direction;

    public Request(int sourceFloor, int destinationFloor, Direction direction) {
        this.sourceFloor = sourceFloor;
        this.destinationFloor = destinationFloor;
        this.direction = direction;
    }

}
