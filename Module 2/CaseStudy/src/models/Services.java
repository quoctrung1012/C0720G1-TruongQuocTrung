package models;

import java.time.LocalDateTime;

public abstract class Services {
    private String Id;
    private String nameService;
    private double nameUseArea;
    private int rentalCosts;
    private int maximumNumberOfPeople;
    private LocalDateTime rentalType;

    public Services() {}

    public Services(String id, String nameService, double nameUseArea, int rentalCosts, int maximumNumberOfPeople, LocalDateTime rentalType) {
        Id = id;
        this.nameService = nameService;
        this.nameUseArea = nameUseArea;
        this.rentalCosts = rentalCosts;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.rentalType = rentalType;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getNameUseArea() {
        return nameUseArea;
    }

    public void setNameUseArea(double nameUseArea) {
        this.nameUseArea = nameUseArea;
    }

    public int getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(int rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public LocalDateTime getRentalType() {
        return rentalType;
    }

    public void setRentalType(LocalDateTime rentalType) {
        this.rentalType = rentalType;
    }

}
