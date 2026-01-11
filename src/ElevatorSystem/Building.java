package ElevatorSystem;

import java.util.List;

public class Building {
    private List<Floor> floors;
    private List<ElevatorCar> elevatorCars;

    public Building(List<Floor> floors, List<ElevatorCar> elevatorCars) {
        this.floors = floors;
        this.elevatorCars = elevatorCars;
    }

}
