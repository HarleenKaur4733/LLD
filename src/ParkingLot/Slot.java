package ParkingLot;

public class Slot {
    int slotNumber;
    Vehicle vehicle;
    boolean isAvailable;

    VehicleType getVehicleType() {
        return vehicle.getVehicleType();
    }
}
