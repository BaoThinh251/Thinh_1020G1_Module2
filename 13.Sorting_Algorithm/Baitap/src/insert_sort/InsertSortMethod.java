package insert_sort;

public class InsertSortMethod {
    public static int[] insertSort(int[] array){
        for(int i = 0; i < array.length; i++){
            int currentElement = array[i];
            int j;
            for(j = i-1; j >= 0 && array[j] > currentElement; j--){
                array[j+1] = array[j];
            }
            array[j+1] = currentElement;
        }
        return array;
    }
}
