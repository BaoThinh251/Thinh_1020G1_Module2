package Point_Moveable;

public class Test3 {
    public static void main(String[] args) {
        Point point = new Point();
        Moveable_Point moveable = new Moveable_Point();
        moveable.setSpeed(3, 5);
        moveable.setXY(1,5);
        System.out.println(point.toString());
        System.out.println(moveable.toString());
    }
}
