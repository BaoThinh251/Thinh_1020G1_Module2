package TH3.comparator;
import TH3.shape.Circle;
import java.util.Comparator;
public class CircleComparator implements Comparator<Circle> {
    public int compare(Circle c1, Circle c2) {
        return Double.compare(c1.getRadius(), c2.getRadius());
    }
}
