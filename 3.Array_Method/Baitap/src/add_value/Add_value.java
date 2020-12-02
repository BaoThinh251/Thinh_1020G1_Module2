package add_value;
import java.util.Scanner;
import java.util.Arrays;
public class Add_value {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9};
        int[] array2 = new int [array1.length + 1];
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(array1));
        System.out.print("Add value: ");
        int add = input.nextInt();
        System.out.print("Index of add: ");
        int indexAdd = input.nextInt();
        if(indexAdd < 0 || indexAdd > array1.length){
            System.out.println("Cannot add to array!");
        } else {
            for(int j = 0; j < array1.length; j++){
                array2[j] = array1[j];
            }
            array2[indexAdd] = add;
            for(int i = indexAdd; i < array1.length; i++){
                array2[i + 1] = array1[i];
            }
            System.out.println(Arrays.toString(array2));
        }

    }
}
