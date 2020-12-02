package min_value_in_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Min_value_in_arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length:  ");
        int a = input.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = input.nextInt();
        }

        int min = array[0];
        int indexMin = 0;
        for (int j = 0; j < array.length; j++){
            if (array[j] < min) {
                min = array[j];
                indexMin = j;
            }
        }
        System.out.print("Min value: ");
        System.out.println(min);
        System.out.print("Index of min: ");
        System.out.println(indexMin);
    }
}

