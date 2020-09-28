package models;

public class Villa extends Services {
    private int standardRoom ;
    private String descriptionOfOtherAmenities;
    private double swimmingPoolArea ;
    private int numberOfFloors;

    public Villa(){}

    public Villa(String id, String nameService, double useArea, double rentalCosts, int maximumNumberOfPeople, String rentalType, int standardRoom, String descriptionOfOtherAmenities, double swimmingPoolArea, int numberOfFloors) {
        super(id, nameService, useArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.standardRoom = standardRoom;
        this.descriptionOfOtherAmenities = descriptionOfOtherAmenities;
        this.swimmingPoolArea = swimmingPoolArea;
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
                ", Tiêu chuẩn phòng : " + standardRoom +
                ". Mô tả tiện nghi khác: " + descriptionOfOtherAmenities + '\'' +
                ". Diện tích hồ bơi" + swimmingPoolArea +
                ". Số tầng: " + numberOfFloors +
                '}' + super.toString();
    }

    @Override
    public void showInFor() {
        System.out.println(this.toString());

    }
}
