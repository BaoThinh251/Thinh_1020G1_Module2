import java.util.Scanner;
public class twenty_prime_number {
    public static void main(String[] args) {
        int count = 0, num= 2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantity: ");
        int number = scanner.nextInt();
        boolean check = false;
        while(count < number) {
            for(int i = 2; i <= Math.sqrt(num); i++) {
                check = false;
                if (num % i == 0) {
                    check = true;
                    break;
                }
            } if(!check){
                System.out.println(num + " Is prime number");
                count++;
            }
            num++;
        }

    }
}
