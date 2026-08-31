package LLD_problems.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class Main {

    enum VehicleSize {
        SMALL, MEDIUM, LARGE
    }

    class Vehicle {
        private VehicleSize size;
        private String vehicleNumber;

        public Vehicle(VehicleSize size, String vehicleNumber) {
            this.size = size;
            this.vehicleNumber = vehicleNumber;
        }

        public VehicleSize getSize() {
            return size;
        }

        public String getVehicleNumber() {
            return vehicleNumber;
        }

        public void exit() {
            System.out.println("Vehicle " + vehicleNumber + " has exited the parking lot.");
        }

        public void enter() {
            System.out.println("Vehicle " + vehicleNumber + " has entered the parking lot.");
        }
    }

    class Ticket {
        private int ticketNumber;
        private Vehicle vehicle;
        private long entryTime;
        private long exitTime;
        private Floor floor;
        private int parkingSpotNumber;
        private int parkingFee;

        public Ticket(int ticketNumber, Vehicle vehicle, long entryTime, Floor floor, int parkingSpotNumber) {
            this.ticketNumber = ticketNumber;
            this.vehicle = vehicle;
            this.entryTime = entryTime;
            this.floor = floor;
            this.parkingSpotNumber = parkingSpotNumber;
        }

        public int getTicketNumber() {
            return ticketNumber;
        }

        public Vehicle getVehicle() {
            return vehicle;
        }

        public long getEntryTime() {
            return entryTime;
        }

        public long getExitTime() {
            return exitTime;
        }

        public void setExitTime(long exitTime) {
            this.exitTime = exitTime;
        }

        public Floor getFloor() {
            return floor;
        }

        public int getParkingSpotNumber() {
            return parkingSpotNumber;
        }

        public int getParkingFee() {
            return parkingFee;
        }

        public void setParkingFee(int parkingFee) {
            this.parkingFee = parkingFee;
        }
    }

    class ParkingSpot {
        private VehicleSize size;
        private boolean isOccupied;
        private Vehicle vehicle;

        public ParkingSpot(VehicleSize size) {
            this.size = size;
            this.isOccupied = false;
            this.vehicle = null;
        }

        public boolean isOccupied() {
            return isOccupied;
        }

        public void parkVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
            this.isOccupied = true;
        }

        public void unparkVehicle() {
            this.vehicle = null;
            this.isOccupied = false;
        }

        public boolean canFitVehicle(Vehicle vehicle) {
            return !isOccupied && vehicle.getSize().ordinal() <= size.ordinal();
        }
    }

    class Floor {
        private int floorNumber;
        private ParkingSpot[] parkingSpots;
        private int availableSpots;

        public Floor(int floorNumber, ParkingSpot[] parkingSpots) {
            this.floorNumber = floorNumber;
            this.parkingSpots = parkingSpots;
            this.availableSpots = parkingSpots.length;
        }

        public ParkingSpot getAvailableSpot(Vehicle vehicle) {
            for (ParkingSpot spot : parkingSpots) {
                if (spot.canFitVehicle(vehicle)) {
                    return spot;
                }
            }
            return null;
        }

        public void addSlot(ParkingSpot spot) {
            // Add a new parking spot to the floor
            // This method can be implemented to dynamically add parking spots if needed
        }
    }

    // should be singleton
    public class ParkingLotSystem {
        private List<Floor> floors;

        ParkingLotSystem() {
            floors = new ArrayList<>();
        }

    }

    interface FeeStrategy {
        int calculateFee(Ticket ticket);
    }

    class FlatRateFeeStrategy implements FeeStrategy {
        private int feePerHour;

        public FlatRateFeeStrategy(int feePerHour) {
            this.feePerHour = feePerHour;
        }

        @Override
        public int calculateFee(Ticket ticket) {
            int hoursParked = (int) Math.ceil((ticket.getExitTime() - ticket.getEntryTime()) / 3600000.0); // Convert
                                                                                                           // milliseconds
                                                                                                           // to hours
            return feePerHour * hoursParked;
        }
    }

    class sizeBasedFeeStrategy implements FeeStrategy {
        private int smallVehicleFee;
        private int mediumVehicleFee;
        private int largeVehicleFee;

        public sizeBasedFeeStrategy(int smallVehicleFee, int mediumVehicleFee, int largeVehicleFee) {
            this.smallVehicleFee = smallVehicleFee;
            this.mediumVehicleFee = mediumVehicleFee;
            this.largeVehicleFee = largeVehicleFee;
        }

        @Override
        public int calculateFee(Ticket ticket) {
            VehicleSize vehicleSize = ticket.getVehicle().getSize();
            switch (vehicleSize) {
                case SMALL:
                    return smallVehicleFee;
                case MEDIUM:
                    return mediumVehicleFee;
                case LARGE:
                    return largeVehicleFee;
                default:
                    throw new IllegalArgumentException("Unknown vehicle size: " + vehicleSize);
            }
        }
    }

    public static void main(String[] args) {

    }
}
