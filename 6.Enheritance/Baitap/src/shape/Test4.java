package shape;

public class Test4 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Triangle triangle = new Triangle();
        triangle.setSide1(3);
        triangle.setSide2(4);
        triangle.setSide3(5);
        triangle.setColor("Red");
        System.out.println(triangle.toString());
        System.out.println(shape.toString());
    }
}
