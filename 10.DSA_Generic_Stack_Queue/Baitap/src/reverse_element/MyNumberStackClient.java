package reverse_element;
import java.util.Arrays;
import java.util.Stack;

public class MyNumberStackClient {
    public static void main(String[] args) {
        Stack<Integer> numStack = new Stack<>();
        numStack.push(1);
        numStack.push(2);
        numStack.push(3);
        numStack.add(4);
        numStack.add(5);
        Stack<Integer> myNumStack = new Stack<>();
        System.out.println(numStack);
        for (int i = (numStack.size() - 1); i >= 0; i--) {
            myNumStack.push(numStack.pop());
        }
        System.out.println(myNumStack);



        Stack<String> wordsStack = new Stack<>();
        wordsStack.push("One");
        wordsStack.push("Two");
        wordsStack.push("Three");
        wordsStack.push("Four");
        wordsStack.push("Five");
        System.out.println(wordsStack);
        Stack<String> myWordsStack = new Stack<>();
        for (int i = (wordsStack.size() - 1); i >= 0; i--) {
            myWordsStack.push(wordsStack.pop());
        }
        System.out.println(myWordsStack);
    }
}
