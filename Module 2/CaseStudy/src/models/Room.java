package models;

import java.time.LocalDateTime;

public class Room extends Services {
    private String freeServiceIncluded = "";
    private ExtraServices extraServices;

    public Room(String freeServiceIncluded, ExtraServices extraServices) {
        this.freeServiceIncluded = freeServiceIncluded;
        this.extraServices = extraServices;
    }

    public Room(String id, String nameService, double useArea, double rentalCosts, int maximumNumberOfPeople, String rentalType, String freeServiceIncluded) {
        super(id, nameService, useArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
        this.extraServices = extraServices;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                ", extraServices=" + extraServices +
                "} " + super.toString();
    }

    @Override
    public void showInFor() {
        System.out.println(this.toString());

    }
}
