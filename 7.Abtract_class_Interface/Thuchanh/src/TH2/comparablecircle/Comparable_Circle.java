package TH2.comparablecircle;
import TH2.shape.Circle;

public class Comparable_Circle extends Circle
        implements Comparable<Comparable_Circle> {

    public Comparable_Circle() {
    }

    public Comparable_Circle(double radius) {
        super(radius);
    }

    public Comparable_Circle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(Comparable_Circle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 0;
    }

}
