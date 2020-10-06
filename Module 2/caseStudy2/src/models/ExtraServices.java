package models;

public class ExtraServices {
    private String nameExtraServices;
    private String amountExtraServices;
    private double priceExtraServices;

    public ExtraServices(String nameExtraServices, String amountExtraServices, double priceExtraServices) {
        this.nameExtraServices = nameExtraServices;
        this.amountExtraServices = amountExtraServices;
        this.priceExtraServices = priceExtraServices;
    }

    public String getNameExtraServices() {
        return nameExtraServices;
    }

    public void setNameExtraServices(String nameExtraServices) {
        this.nameExtraServices = nameExtraServices;
    }

    public String getAmountExtraServices() {
        return amountExtraServices;
    }

    public void setAmountExtraServices(String amountExtraServices) {
        this.amountExtraServices = amountExtraServices;
    }

    public double getPriceExtraServices() {
        return priceExtraServices;
    }

    public void setPriceExtraServices(double priceExtraServices) {
        this.priceExtraServices = priceExtraServices;
    }

    @Override
    public String toString() {
        return "ExtraServices{" +
                "nameExtraServices='" + nameExtraServices + '\'' +
                ", amountExtraServices=" + amountExtraServices +
                ", priceExtraServices=" + priceExtraServices +
                '}';
    }
}
