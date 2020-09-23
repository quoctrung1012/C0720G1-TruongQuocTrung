package models;

import java.time.LocalDateTime;

public class House extends Services {
    private int standardRoom = 0;
    private String descriptionOfOtherAmenities = "";
    private int numberOfFloors = 0;

    public House() {
    }

    public House(int standardRoom, String descriptionOfOtherAmenities, int numberOfFloors) {
        this.standardRoom = standardRoom;
        this.descriptionOfOtherAmenities = descriptionOfOtherAmenities;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String id, String nameService, double nameUseArea, int rentalCosts, int maximumNumberOfPeople, LocalDateTime rentalType, int standardRoom, String descriptionOfOtherAmenities, int numberOfFloors) {
        super(id, nameService, nameUseArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.standardRoom = standardRoom;
        this.descriptionOfOtherAmenities = descriptionOfOtherAmenities;
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
