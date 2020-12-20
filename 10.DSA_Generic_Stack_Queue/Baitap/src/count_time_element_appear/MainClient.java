package count_time_element_appear;

import java.util.Map;
import java.util.TreeMap;

public class MainClient {
    public static void main(String[] args) {
        String myString = "Tomorrow_is_Wednesday";
        char[] myStringArray = myString.toUpperCase().toCharArray();

        Map<Character, Integer> myNewMap = new TreeMap<>();
        for (char c : myStringArray) {
            if (myNewMap.containsKey(c)) {
                myNewMap.put(c, myNewMap.get(c) + 1);
            } else {
                myNewMap.put(c, 1);
            }
        }
        System.out.println(myNewMap);
    }
}
