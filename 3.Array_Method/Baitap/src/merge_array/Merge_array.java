package merge_array;
import java.util.Arrays;
public class Merge_array {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = {11,12,13,14,15,16,17,18,19,20};
        int[] array3 = new int[array1.length + array2.length];
        for(int i = 0; i < array1.length; i++){
            array3[i] = array1[i];
        }
        for(int j = 0; j < array2.length; j++){
            array3[j + array2.length] = array2[j];
        }
        System.out.println(Arrays.toString(array3));
    }
}
