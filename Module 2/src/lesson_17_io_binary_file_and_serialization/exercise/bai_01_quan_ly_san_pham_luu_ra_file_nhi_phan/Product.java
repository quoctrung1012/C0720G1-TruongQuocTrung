package lesson_17_io_binary_file_and_serialization.exercise.bai_01_quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.io.Serializable;

public class Product implements Serializable {
    private int idProduct;
    private String nameProduct;
    private String nameProducer;
    private double price;
    private String productDescription;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, String originOfTheProduct, double price, String productDescription) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.nameProducer = originOfTheProduct;
        this.price = price;
        this.productDescription = productDescription;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameProducer() {
        return nameProducer;
    }

    public void setNameProducer(String nameProducer) {
        this.nameProducer = nameProducer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @Override
    public String toString() {
        return "------------------------------------" +
                "\nId Product: " + idProduct +
                "\nName Product: " + nameProduct +
                "\nName Producer: " + nameProducer +
                "\nPrice Product: " + price +
                "\nProduct Description: " + productDescription +
                "\n------------------------------------";
    }
}
