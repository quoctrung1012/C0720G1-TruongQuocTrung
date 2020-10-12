package models;

import java.time.LocalDateTime;

public class Room extends Services {
    private ExtraServices extraServices;

    public Room(String s, String s1, double v, double parseDouble, int i, String s2, String s3, ExtraServices extraServices) {
    }

    public Room(ExtraServices extraServices) {
        this.extraServices = extraServices;
    }

    public Room(String id, String nameService, double useArea, double rentalCosts, int maximumNumberOfPeople, String rentalType, ExtraServices extraServices) {
        super(id, nameService, useArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.extraServices = extraServices;
    }

    public ExtraServices getExtraServices() {
        return extraServices;
    }

    public void setExtraServices(ExtraServices extraServices) {
        this.extraServices = extraServices;
    }

    @Override
    public String toString() {
        return "Room \t" +
                super.toString() +
                ",Extra Services: " + extraServices +
                "\n-------------------------------------";
    }

    @Override
    public void showInFor() {
        System.out.println(this.toString());

    }
}
