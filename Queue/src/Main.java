
public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(11);
        q.enQueue(12);
        q.enQueue(13);
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
    }
}