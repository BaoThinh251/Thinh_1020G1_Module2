package access_modifier;

public class class_modifier {
        private double radius;
        private String color;
        public class_modifier(double radius, String color) {
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
}
