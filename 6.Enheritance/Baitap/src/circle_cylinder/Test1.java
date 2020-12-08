package circle_cylinder;

public class Test1 {
    public static void main(String[] args) {
        Circle Cc = new Circle( 5, "Blue");
        System.out.println(Cc.toString());
        System.out.println(Cc.getSArea());
        Cylinder Cy = new Cylinder(5, "Red", 7);
        System.out.println(Cy.toString());
        System.out.println(Cy.getVolume());
    }
}
