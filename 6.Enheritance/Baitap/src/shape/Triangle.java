package shape;

public class Triangle extends Shape {
    private double side1 = 1, side2 = 1, side3 = 1;
    private String color ="Blue";
    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
    }
    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public double getSide2() {
        return side2;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public double getSide3() {
        return side3;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getArea(){
        return "Area is: " + (this.side1 + this.side2 + this.side3);
    }
    public String getPerimeter(){
        return "Perimeter is: " + 15;
    }

    @Override
    public String toString() {
        return "Side 1 is: " + this.side1 + ", Side 2 is: " + this.side2 + ", Side 3 is: "
                + this.side3 + getArea() +  getPerimeter() +  " , Color is: " + this.color;
    }
}
