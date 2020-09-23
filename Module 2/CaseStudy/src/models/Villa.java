package models;

import java.time.LocalDateTime;

public class Villa extends Services {
    private int standardRoom = 0;
    private String descriptionOfOtherAmenities = "";
    private double swimmingPoolArea = 0.0;
    private int numberOfFloors = 0;

    public Villa() {
    }

    public Villa(int standardRoom, String descriptionOfOtherAmenities, double swimmingPoolArea, int numberOfFloors) {
        this.standardRoom = standardRoom;
        this.descriptionOfOtherAmenities = descriptionOfOtherAmenities;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String id, String nameService, double nameUseArea, int rentalCosts, int maximumNumberOfPeople, LocalDateTime rentalType, int standardRoom, String descriptionOfOtherAmenities, double swimmingPoolArea, int numberOfFloors) {
        super(id, nameService, nameUseArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.standardRoom = standardRoom;
        this.descriptionOfOtherAmenities = descriptionOfOtherAmenities;
        this.swimmingPoolArea = swimmingPoolArea;
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
