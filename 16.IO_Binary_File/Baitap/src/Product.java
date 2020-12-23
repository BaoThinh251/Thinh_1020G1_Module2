import java.io.Serializable;

public class Product implements Serializable{
    private int id;
    private double price;
    private String name, brand, otherDescription;

    public Product() {
    }

    public Product(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public Product(String name, int id, double price, String brand, String otherDescription) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.brand = brand;
        this.otherDescription = otherDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOtherDescription() {
        return otherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }

    @Override
    public String toString() {
        return "Product name: " + getName() + ", Product ID:" + getId() + ", Product Brand: " + getBrand()
                + ", Price: " + getPrice() + ", Other Description: " + getOtherDescription();
    }
}
