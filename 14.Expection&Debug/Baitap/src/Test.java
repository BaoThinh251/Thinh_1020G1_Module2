import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       try {
           System.out.println("Enter side a: ");
           int a = input.nextInt();
           System.out.println("Enter side b: ");
           int b = input.nextInt();
           System.out.println("Enter side c: ");
           int c = input.nextInt();
           Triangle triangle = new Triangle(a, b, c);
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }
}
