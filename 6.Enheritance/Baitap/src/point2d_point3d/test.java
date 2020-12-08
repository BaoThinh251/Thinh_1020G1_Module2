package point2d_point3d;
import java.util.Arrays;
public class test {
    public static void main(String[] args) {
        Point2D point1 = new Point2D(3, 5);
        System.out.println(point1.getXY());
        Point3D point2 = new Point3D(4,6,1);
        System.out.println(point2.getXYZ());
    }
}
