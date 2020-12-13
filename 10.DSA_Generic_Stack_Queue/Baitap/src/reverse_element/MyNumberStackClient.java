package reverse_element;
import java.util.Arrays;
import java.util.Stack;

public class MyNumberStackClient {
    public static void main(String[] args) {
        int[] numArray = {1, 2, 3, 4, 5};
        Stack<Integer> myNumStack = new Stack<>();
        for (int i = (numArray.length - 1); i >= 0; i--) {
            myNumStack.push(numArray[i]);
        }
        System.out.println(Arrays.toString(numArray));
        System.out.println(myNumStack);
        String[] wordsArray = {"one", "two", "three", "four", "five"};
        Stack<String> myWordsStack = new Stack<String>();
        for (int i = (wordsArray.length - 1); i >= 0; i--) {
            myWordsStack.push(wordsArray[i]);
        }
        System.out.println(Arrays.toString(wordsArray));
        System.out.println(myWordsStack);
    }
}
