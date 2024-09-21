
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        Node n1 = new Node(15);
        Node n2 = new Node(24);

        list.push(n1);
        list.push(n2);

        // Display the list before popping any element
        DoublyLinkedList tempList = list;
        while (tempList.head != null) {
            System.out.println(tempList.head.data);
            tempList.head = tempList.head.next;
        }

        // Pop one element and display the list
        list.pop();

        tempList = list;
        while (tempList.head != null) {
            System.out.println(tempList.head.data);
            tempList.head = tempList.head.next;
        }

        // Pop remaining elements
        list.pop();
        list.pop();
    }
}