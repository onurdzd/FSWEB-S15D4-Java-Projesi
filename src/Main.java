import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));

        System.out.println(checkForPalindromeWithQueue("abccba"));
        System.out.println(checkForPalindromeWithQueue("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindromeWithQueue("I did, did I?"));
        System.out.println(checkForPalindromeWithQueue("hello"));
        System.out.println(checkForPalindromeWithQueue("Don't node"));

    }

    public static boolean checkForPalindrome(String text) {
        Stack<Object> stack1=new Stack<>();
        Stack<Object> stack2=new Stack<>();
        String[] splittedLetters=text.trim().toLowerCase().replaceAll("[^a-zA-Z]", "").split("");
        for (String splittedLetter:splittedLetters
             ) {
            stack1.add(splittedLetter);
        }
        for (int i= splittedLetters.length-1;i>=0;i--){
            stack2.add(splittedLetters[i]);
        }
        return stack1.equals(stack2);
    }

    public static boolean checkForPalindromeWithQueue(String text) {

        Stack<Object> stack1=new Stack<>();
        Queue<Object> queue1=new LinkedList<>();

        String[] splittedLetters=text.trim().toLowerCase().replaceAll("[^a-zA-Z]", "").split("");
        for (String splittedLetter:splittedLetters
        ) {
            stack1.add(splittedLetter);
            queue1.offer(splittedLetter);
        }

        StringBuilder duz= new StringBuilder();
        while(0<stack1.size()){
            duz.append(stack1.pop());
        }
        int y= queue1.size();
        StringBuilder ters= new StringBuilder();
        while(0<y){
            ters.append(queue1.poll());
            y--;
        }

        return  duz.toString().equals(ters.toString());
    }
}