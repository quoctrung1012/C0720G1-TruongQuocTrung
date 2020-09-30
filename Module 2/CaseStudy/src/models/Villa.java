package models;

public class Villa extends Services {
    private String standardRoom;
    private String descriptionOfOtherAmenities;
    private double swimmingPoolArea;
    private int numberOfFloors;

    public Villa() {

    }

    public Villa(String standardRoom, String descriptionOfOtherAmenities, double swimmingPoolArea, int numberOfFloors) {
        this.standardRoom = standardRoom;
        this.descriptionOfOtherAmenities = descriptionOfOtherAmenities;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String id, String nameService, double useArea, double rentalCosts, int maximumNumberOfPeople, String rentalType, String standardRoom, String descriptionOfOtherAmenities, double swimmingPoolArea, int numberOfFloors) {
        super(id, nameService, useArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.standardRoom = standardRoom;
        this.descriptionOfOtherAmenities = descriptionOfOtherAmenities;
        this.swimmingPoolArea = swimmingPoolArea;
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

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standardRoom='" + standardRoom + '\'' +
                ", descriptionOfOtherAmenities='" + descriptionOfOtherAmenities + '\'' +
                ", swimmingPoolArea=" + swimmingPoolArea +
                ", numberOfFloors=" + numberOfFloors +
                "} " + super.toString();
    }

    @Override
    public void showInFor() {
        System.out.println(this.toString());

    }
}
