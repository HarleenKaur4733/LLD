package ParkingLot;

public class Ticket {
    String ticketNumber;
    Vehicle vehicle;
    Slots slots;

    public VehicleType getVehicleType() {
        return vehicle.getVehicleType();
    }

    public int getAvailabeSlot() {
        // Login to get availabe slot
        return 0;
    }

}
