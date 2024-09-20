import java.util.Stack;
public class Queue {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    void enQueue(int data) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(data);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    int deQueue() {
        if (s1.isEmpty()) {
            System.exit(0); // Exit if the queue is empty
        }
        return s1.pop();
    }
}
