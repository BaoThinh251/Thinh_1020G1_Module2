import java.util.Scanner;
public class convertMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        System.out.println("Nhap so USD can doi qua VND: ");
        double USD = scanner.nextDouble();
        System.out.println("VND: " + USD * rate);
    }
}
