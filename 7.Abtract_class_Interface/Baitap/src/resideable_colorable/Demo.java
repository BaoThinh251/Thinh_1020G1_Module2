package resideable_colorable;

public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.resize();
        System.out.println(circle);

        System.out.println(" ");

        Rectangle rectangle = new Rectangle();
        rectangle.resize();
        System.out.println(rectangle);

        System.out.println(" ");

        Square square = new Square();
        square.resize();
        System.out.println(square);
        square.how_To_Color();


    }
}
