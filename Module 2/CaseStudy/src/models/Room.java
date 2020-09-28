package models;

import java.time.LocalDateTime;

public class Room extends Services {
    private String freeServiceIncluded = "";

    public Room(){}
    public Room(String id, String nameService, double useArea, double rentalCosts, int maximumNumberOfPeople, String rentalType, String freeServiceIncluded) {
        super(id, nameService, useArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}' + super.toString();
    }

    @Override
    public void showInFor() {
        System.out.println(this.toString());

    }
}
