package TH2.comparablecircle;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Comparable_Circle[] circles = new Comparable_Circle[3];
        circles[0] = new Comparable_Circle(3.6);
        circles[1] = new Comparable_Circle();
        circles[2] = new Comparable_Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Comparable_Circle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (Comparable_Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
