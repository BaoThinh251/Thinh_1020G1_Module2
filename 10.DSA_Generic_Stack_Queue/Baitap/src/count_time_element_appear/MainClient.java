package count_time_element_appear;

import java.util.Map;
import java.util.TreeMap;

public class MainClient {
    public static void main(String[] args) {
        String myString = "Tomorrow_is_Wednesday";
        char[] myStringArray = myString.toUpperCase().toCharArray();

        Map<Character, Integer> myNewMap = new TreeMap<>();
        for (int i = 0; i < myStringArray.length; i++) {
            if(myNewMap.containsKey(myStringArray[i])){
                myNewMap.put(myStringArray[i], myNewMap.get(myStringArray[i])+1);
            } else {
                myNewMap.put(myStringArray[i], 1);
            }
        }
        System.out.println(myNewMap);
    }
}
