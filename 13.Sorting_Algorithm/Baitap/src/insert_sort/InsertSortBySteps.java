package insert_sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSortBySteps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1,5,3,2,9,7,6,8,10,4};
//        for(int i = 0; i < array.length-1; i++){
//            for(int j = 0; j < array.length-1; j++){
//                if(array[j] > array[j+1]){
//                    int temp = array[j];
//                    array[j] = array[j+1];
//                    array[j+1] = temp;
//                }
//            }
//        }
        InsertSortMethod.insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
