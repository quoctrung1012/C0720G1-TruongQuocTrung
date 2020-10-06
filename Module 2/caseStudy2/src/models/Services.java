package models;

public abstract class Services {
    protected String id;
    protected String nameService;
    protected double useArea;
    protected double rentalCosts;
    protected int maximumNumberOfPeople;
    protected String rentalType;

    public Services() {
    }

    public Services(String id, String nameService, double useArea, double rentalCosts, int maximumNumberOfPeople, String rentalType) {
        this.id = id;
        this.nameService = nameService;
        this.useArea = useArea;
        this.rentalCosts = rentalCosts;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUseArea() {
        return useArea;
    }

    public void setUseArea(double useArea) {
        this.useArea = useArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", useArea=" + useArea +
                ", rentalCosts=" + rentalCosts +
                ", maximumNumberOfPeople=" + maximumNumberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
    public abstract void showInFor();
}
