package bai_thi_module.models;

public abstract class Product {
    private int id ;
    private String codeProduct;
    private String nameProduct;
    private String priceProduct;
    private String amountProduct;
    private String nameProducerProduct;

    public Product() {
    }

    public Product(int id, String codeProduct, String nameProduct, String priceProduct, String amountProduct, String nameProducerProduct) {
        this.id = id;
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.amountProduct = amountProduct;
        this.nameProducerProduct = nameProducerProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(String priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getAmountProduct() {
        return amountProduct;
    }

    public void setAmountProduct(String amountProduct) {
        this.amountProduct = amountProduct;
    }

    public String getNameProducerProduct() {
        return nameProducerProduct;
    }

    public void setNameProducerProduct(String nameProducerProduct) {
        this.nameProducerProduct = nameProducerProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", codeProduct='" + codeProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                ", amountProduct=" + amountProduct +
                ", nameProducerProduct='" + nameProducerProduct + '\'' +
                '}';
    }
    public abstract void showInFor();
}
