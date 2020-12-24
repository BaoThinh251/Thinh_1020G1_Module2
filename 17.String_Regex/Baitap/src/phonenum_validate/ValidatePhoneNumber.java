package phonenum_validate;

import java.util.Scanner;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input phone number: ");
        String phoneNumber = input.next();
        String regex = "(84)[0-9]{9,10}";
        System.out.println(phoneNumber.matches(regex));
    }
}
