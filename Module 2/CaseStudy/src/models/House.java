package models;

import java.time.LocalDateTime;

public class House extends Services {
    private int standardRoom = 0;
    private String descriptionOfOtherAmenities = "";
    private int numberOfFloors = 0;

    public House(){}
    public House(String id, String nameService, double useArea, double rentalCosts, int maximumNumberOfPeople, String rentalType, int standardRoom, String descriptionOfOtherAmenities, int numberOfFloors) {
        super(id, nameService, useArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.standardRoom = standardRoom;
        this.descriptionOfOtherAmenities = descriptionOfOtherAmenities;
        this.numberOfFloors = numberOfFloors;
    }

    public int getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(int standardRoom) {
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
                super.toString() +
                ". Tiêu chuẩn phòng : " + standardRoom +
                ". Mô tả tiện nghi khác: " + descriptionOfOtherAmenities + '\'' +
                ". Số tầng: " + numberOfFloors +
                '}' + super.toString();
    }

    @Override
    public void showInFor() {
        System.out.println(this.toString());
    }
}
