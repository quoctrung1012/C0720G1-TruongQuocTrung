package models;

import java.time.LocalDateTime;

public class House extends Services {
    private String standardRoom;
    private String descriptionOfOtherAmenities;
    private int numberOfFloors;

    public House(){}

    public House(String standardRoom, String descriptionOfOtherAmenities, int numberOfFloors) {
        this.standardRoom = standardRoom;
        this.descriptionOfOtherAmenities = descriptionOfOtherAmenities;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String id, String nameService, double useArea, double rentalCosts, int maximumNumberOfPeople, String rentalType, String standardRoom, String descriptionOfOtherAmenities, int numberOfFloors) {
        super(id, nameService, useArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.standardRoom = standardRoom;
        this.descriptionOfOtherAmenities = descriptionOfOtherAmenities;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOfOtherAmenities() {
        return descriptionOfOtherAmenities;
    }

    public void setDescriptionOfOtherAmenities(String descriptionOfOtherAmenities) {
        this.descriptionOfOtherAmenities = descriptionOfOtherAmenities;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "standardRoom='" + standardRoom + '\'' +
                ", descriptionOfOtherAmenities='" + descriptionOfOtherAmenities + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                "} " + super.toString();
    }

    @Override
    public void showInFor() {
        System.out.println(this.toString());
    }
}
