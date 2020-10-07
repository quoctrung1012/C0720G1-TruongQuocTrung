package models;

public class Room extends Services {
    private ExtraServices extraServices;

    public Room() {
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
        return "Room\n "
                + super.toString()
                + "\nExtra Services: " + extraServices
                + "\n-------------------------------------";
    }

    @Override
    public void showInFor() {
        System.out.println(this.toString());
    }
}
