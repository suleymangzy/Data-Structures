
public class Main {
    public static void main(String[] args) {
        LinkedList2 a = new LinkedList2(10);
        LinkedList2 b = new LinkedList2(20);
        LinkedList2 c = new LinkedList2(30);
        LinkedList2 d = new LinkedList2(-40);
        LinkedList2 e = new LinkedList2(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        LinkedList2 head = a;
        head = LinkedList2.moveNegativeToFront(head); // Move the first negative node to the front

        LinkedList2 current = head;
        while (current != null) {
            System.out.println(current.data); // Print the updated list
            current = current.next;
        }
    }
}