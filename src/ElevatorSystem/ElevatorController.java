package ElevatorSystem;

import java.util.List;
import java.util.Queue;

public class ElevatorController {
    Queue<Integer> upRequests;
    Queue<Integer> downRequests;
    List<ElevatorCar> elevatorCars;

    public ElevatorController(List<ElevatorCar> elevatorCars) {
        this.elevatorCars = elevatorCars;
    }

    public void handleRequest(Request request) {
        ElevatorCar elevatorAssigned = assignElevatorCar(request);
        if (request.destinationFloor != -1) {
            elevatorAssigned.addStops(request.destinationFloor);
        } else {
            elevatorAssigned.addStops(request.destinationFloor);
        }
    }

    private ElevatorCar assignElevatorCar(Request request) {
        ElevatorCar elevatorAssigned = null;
        for (ElevatorCar elevatorCar : elevatorCars) {

            int minDistance = Integer.MAX_VALUE;
            int distance = Math.abs(elevatorCar.getCurrentFloor() - request.sourceFloor);
            if (distance < minDistance) {
                minDistance = distance;
                elevatorAssigned = elevatorCar;
            }
        }
        System.out.println("ELEVATOR ASSIGNED: " + elevatorAssigned);
        return elevatorAssigned;
    }
}
