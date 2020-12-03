package quadratic_equation;
import java.util.Scanner;
public class Quadratic_Equation {
    public static class QuadraticEquation{
        double a, b, c;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public double getR1(){
            return (-this.b + Math.sqrt(getDelta())) / (2 * this.a);
        }
        public double getR2(){
            return (-this.b - Math.sqrt(getDelta())) / (2 * this.a);
        }
        public double getDelta() {
            return  ((this.b * this.b) - 4 * (this.a * this.c));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();
        QuadraticEquation BT1 = new QuadraticEquation (a, b, c);
        if (BT1.getDelta() < 0){
            System.out.print("The equation has no roots!");
        } else if (BT1.getDelta() == 0){
            System.out.print("The equation has double root: " + ((-b) / 2 * a));
        } else if(BT1.getDelta() > 0) {
            System.out.print("The equation has two roót: " + BT1.getR1() + " and: " + BT1.getR2());
        }
    }
}
