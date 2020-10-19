package bai_thi_module.models;

public class ImportProduct extends Product {
    private String priceImport;
    private String cityImport;
    private String taxImport;

    public ImportProduct() {
    }

    public ImportProduct(String priceImport, String cityImport, String taxImport) {
        this.priceImport = priceImport;
        this.cityImport = cityImport;
        this.taxImport = taxImport;
    }

    public ImportProduct(int id, String codeProduct, String nameProduct, String priceProduct, String amountProduct, String nameProducerProduct, String priceImport, String cityImport, String taxImport) {
        super(id, codeProduct, nameProduct, priceProduct, amountProduct, nameProducerProduct);
        this.priceImport = priceImport;
        this.cityImport = cityImport;
        this.taxImport = taxImport;
    }

    public String getPriceImport() {
        return priceImport;
    }

    public void setPriceImport(String priceImport) {
        this.priceImport = priceImport;
    }

    public String getCityImport() {
        return cityImport;
    }

    public void setCityImport(String cityImport) {
        this.cityImport = cityImport;
    }

    public String getTaxImport() {
        return taxImport;
    }

    public void setTaxImport(String taxImport) {
        this.taxImport = taxImport;
    }

    @Override
    public String toString() {
        return "ImportProduct{" +
                "priceImport=" + priceImport +
                ", cityImport='" + cityImport + '\'' +
                ", taxImport=" + taxImport +
                "} " + super.toString();
    }

    @Override
    public void showInFor() {
        System.out.println(this.toString());
    }
}
