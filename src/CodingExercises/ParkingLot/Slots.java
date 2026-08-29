package ParkingLot;

import java.util.List;

public abstract class Slots {
    private final List<Slot> slotsList;

    Slots(List<Slot> slotsList) {
        this.slotsList = slotsList;
    }

    public abstract int getAvailabeSlot();

}
