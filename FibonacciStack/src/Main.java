import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Double> s = new Stack<Double>();
        double temp1, temp2;

        for (double i = 0; i < 100; i++) {
            if (i < 2) {
                s.push(i);
            } else {
                temp1 = s.pop();
                temp2 = s.pop();
                s.push(temp2);
                s.push(temp1);
                s.push(temp1 + temp2);
            }
        }

        Stack<Double> s1 = s;

        while (!s1.isEmpty()) {
            System.out.println(s1.pop());
        }
    }
}