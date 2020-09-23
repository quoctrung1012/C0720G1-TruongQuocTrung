package models;

import java.time.LocalDateTime;

public class Room extends Services {
    private String freeServiceIncluded = "";

    public Room() {
    }

    public Room(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String id, String nameService, double nameUseArea, int rentalCosts, int maximumNumberOfPeople, LocalDateTime rentalType, String freeServiceIncluded) {
        super(id, nameService, nameUseArea, rentalCosts, maximumNumberOfPeople, rentalType);
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
