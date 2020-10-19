package bai_thi_module.models;

public class ExtraProduct extends Product{
    private String priceExtra;
    private String countryExtra;

    public ExtraProduct(){}

    public ExtraProduct(String priceExtra, String countryExtra) {
        this.priceExtra = priceExtra;
        this.countryExtra = countryExtra;
    }

    public ExtraProduct(int id, String codeProduct, String nameProduct, String priceProduct, String amountProduct, String nameProducerProduct, String priceExtra, String countryExtra) {
        super(id, codeProduct, nameProduct, priceProduct, amountProduct, nameProducerProduct);
        this.priceExtra = priceExtra;
        this.countryExtra = countryExtra;
    }

    public String getPriceExtra() {
        return priceExtra;
    }

    public void setPriceExtra(String priceExtra) {
        this.priceExtra = priceExtra;
    }

    public String getCountryExtra() {
        return countryExtra;
    }

    public void setCountryExtra(String countryExtra) {
        this.countryExtra = countryExtra;
    }

    @Override
    public String toString() {
        return "ExtraProduct{" +
                "priceExtra=" + priceExtra +
                ", countryExtra='" + countryExtra + '\'' +
                "} " + super.toString();
    }

    @Override
    public void showInFor() {
        System.out.println(this.toString());
    }
}
