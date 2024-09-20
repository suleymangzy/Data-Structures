import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String text = "(a+b)-(c/d*(a-c))";
        int check = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') {
                s.push('(');
            }
            if (!s.isEmpty() && text.charAt(i) == ')') {
                s.pop();
            } else if (text.charAt(i) == ')') {
                check++;
            }
        }

        if (s.isEmpty() && (check == 0)) {
            System.out.println("The character input is correct.");
        } else {
            System.out.println("There is an error in the text format.");
        }
    }
}