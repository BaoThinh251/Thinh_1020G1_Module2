package TH3.comparator;
import TH3.shape.Circle;
import java.util.Comparator;
public class CircleComparator extends Circle {
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
