package ElevatorSystem;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // Add Elevators
        ElevatorCar elevatorCar1 = new ElevatorCar();
        ElevatorCar elevatorCar2 = new ElevatorCar();
        ElevatorCar elevatorCar3 = new ElevatorCar();
        List<ElevatorCar> elevatorCars = new ArrayList<>();
        elevatorCars.add(elevatorCar1);
        elevatorCars.add(elevatorCar2);
        elevatorCars.add(elevatorCar3);

        ElevatorController elevatorController = new ElevatorController(elevatorCars);

        // Add floors
        Floor floor0 = new Floor(0, elevatorController);
        Floor floor1 = new Floor(1, elevatorController);
        Floor floor2 = new Floor(2, elevatorController);
        Floor floor3 = new Floor(3, elevatorController);
        Floor floor4 = new Floor(4, elevatorController);
        List<Floor> floors = new ArrayList<>();
        floors.add(floor0);
        floors.add(floor1);
        floors.add(floor2);
        floors.add(floor3);
        floors.add(floor4);

        // Add floors and elevators to building
        Building building = new Building(floors, elevatorCars);

        System.out.println("PRESSING UP BUTTON");
        System.out.println(floors.get(2));
        System.out.println(floors.get(2).getUpButton());

        floors.get(2).getUpButton().press();

        for (ElevatorCar elevatorCar : elevatorCars) {
            elevatorCar.move();
        }
    }
}
