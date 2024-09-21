
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        Node n1 = new Node(10);
        Node n2 = new Node(8);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(36);


        list.enqueue(n1);
        list.print();
        list.enqueue(n2);
        list.print();
        list.enqueue(n3);
        list.print();
        list.enqueue(n4);
        list.print();
        list.enqueue(n5);
        list.print();


        list.dequeue();
        list.print();
        list.dequeue();
        list.print();
    }
}