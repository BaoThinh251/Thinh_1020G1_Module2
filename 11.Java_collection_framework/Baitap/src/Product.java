import java.util.Comparator;

public class Product {
    private String Name, Color;
    private double id, price;

    public Product() {
    }

    public Product(String name, String color, double id, double price) {
        this.Name = name;
        this.Color = color;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sản phẩm có mã là: " + getId() + " ,có tên là: " + getName() + " ,có giá là: " + getPrice() + " ,có màu là: " + getColor();
    }

}
