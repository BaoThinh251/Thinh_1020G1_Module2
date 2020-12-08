package circle_cylinder;

public class Cylinder extends Circle {
    private double height;
    private double radius = super.getRadius();
    private String color = super.getColor();
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return (this.getSArea() * this.height);
    }

    @Override
    public String toString() {
        return "Radius is: " + this.radius + ", Color is: " + this.color  + ", Height is: " + this.height;
    }
}
