package fan_class;

public class Fan_class {
    private int speed = 1;
    private double radius = 5;
    private boolean on = false;
    private String color = "Blue", status;
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getStatus() {
        return status;
    }
    public Fan_class() {
    }
    public String toStrings() {
        if (this.isOn()) {
            status = "Speed is: " + this.speed + ", Radius is: " + this.radius + ", Color is: " + this.color + ", Fan is on!";
        } else {
            status = "Radius is: " + this.radius + ", Color is: " + this.color + ", Fan is off!";
        }
        return status;
    }
}
