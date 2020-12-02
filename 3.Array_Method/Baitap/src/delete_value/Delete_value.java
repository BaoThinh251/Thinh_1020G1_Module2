package delete_value;
import java.util.Scanner;
import java.util.Arrays;

public class Delete_value {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(array1));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Delete: ");
        int X = scanner.nextInt();
        int indexX = 0;
        boolean check = false;
        for (int i = 0; i < array1.length; i++) {
            if (X == array1[i]) {
                indexX = i;
                check =true;
                break;
            }
        }
        for(int j = indexX; j < array1.length - 1; j++) {
            array1[j] = array1[j+1];
        }
        if(check == true){
            array1[array1.length-1] = 0;
            System.out.println(Arrays.toString(array1));
        } else {
            System.out.println("Invalid input!");
        }
    }
}


