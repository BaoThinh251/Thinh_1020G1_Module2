package circle_cylinder;

public class Circle {
    private double radius;
    private String color;
    public final double PI = 3.14;
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getSArea(){
        return ((this.radius * this.radius) * PI);
    }

    @Override
    public String toString() {
        return "Radius is: " + this.radius + ", Color is: " + this.color;
    }
}
