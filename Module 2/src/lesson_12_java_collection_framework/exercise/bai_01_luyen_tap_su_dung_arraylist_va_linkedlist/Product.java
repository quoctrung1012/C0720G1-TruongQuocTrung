package lesson_12_java_collection_framework.exercise.bai_01_luyen_tap_su_dung_arraylist_va_linkedlist;

public class Product{
    private int id;
    private String name;
    private String productInformation;
    private double price;
    private int count = 0;

    public Product() {
    }

    public Product(int id, String name, String productInformation, int price) {
        this.id = id;
        this.name = name;
        this.productInformation = productInformation;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductInformation() {
        return productInformation;
    }

    public void setProductInformation(String productInformation) {
        this.productInformation = productInformation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product "+ count++ + "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productInformation='" + productInformation + '\'' +
                ", price=" + price +
                '}';
    }



}
