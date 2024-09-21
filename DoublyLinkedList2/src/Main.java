
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node n1 = new Node(10);
        Node n2 = new Node(8);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(36);

        // Adding nodes to the end of the list and printing
        list.addAtEnd(n1);
        list.print();
        list.addAtEnd(n2);
        list.print();
        list.addAtEnd(n3);
        list.print();
        list.addAtEnd(n4);
        list.print();
        list.addAtEnd(n5);
        list.print();

        // Removing nodes from the end and printing
        list.removeFromEnd();
        list.print();
        list.removeFromEnd();
        list.print();
        list.removeFromEnd();
        list.print();
        list.removeFromEnd();
        list.print();
        list.removeFromEnd();
        list.print();
        list.removeFromEnd();
        list.print();    }
}