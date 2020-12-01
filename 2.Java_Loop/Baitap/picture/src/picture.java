import java.util.Scanner;

public class picture {
    public static void main(String[] args) {

        int choice = -1;
        Scanner input = new Scanner(System.in);

        while (choice != 5) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the triangle bottom left");
            System.out.println("3. Draw the triangle top left");
            System.out.println("4. Draw the isosceles triangle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch(choice) {
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        System.out.println();
                        for(int j = 1; j <= 6; j++){
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                    break;
                case 2:
                    for(int i = 1; i <= 6; i++) {
                        System.out.println();
                        for (int j = 1; j < i; j++){
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    for(int i = 5; i >= 1; i--){
                        System.out.println();
                        for(int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    for(int i = 1; i <= 6; i++) {
                        System.out.println();
                        for (int j = 1; j < i; j++){
                            System.out.print("*");
                        }
                    }
                    for(int i = 5; i >= 1; i--){
                        System.out.println();
                        for(int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Exit");
                default:
                    System.out.println("Different input please!");
                    break;
            }
        }
    }
}
