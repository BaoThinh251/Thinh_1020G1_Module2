package max_2d_array;
import java.util.Arrays;
import java.util.Scanner;
public class Max_2D_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length:  ");
        int a = input.nextInt();
        System.out.print("Input amout of Array: ");
        int b = input.nextInt();
        int[][] array = new int[a][b];
        System.out.println("Enter " + a + " collums and " + b + " row: ");
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.print("Enter collums " + i + " row " + j + " : ");
                array[i][j] = input.nextInt();
            }
        }
//        int[][] array = {{1,12,3,4,5,6,7,8,9,10},
//                {11,2,13,50,15,16,31,18,19,20},};
        int max = 0;
        int[] indexMax = {0,0};
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] > max){
                    max = array[i][j];
                    indexMax[0] = i;
                    indexMax[1] = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(Arrays.toString(indexMax));

    }
}
