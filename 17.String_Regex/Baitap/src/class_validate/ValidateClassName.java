package class_validate;

import java.util.Scanner;

public class ValidateClassName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input class name: ");
        String className = input.next();
        String regex = "[CAP][0-9]{4}[GHIKLM]";
        System.out.println(className.matches(regex));
    }
}
