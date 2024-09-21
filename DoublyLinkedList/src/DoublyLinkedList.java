public class DoublyLinkedList {
    Node head;
    Node tail;

    // Constructor
    DoublyLinkedList(){
        head = null;
        tail = null;
    }

    // Method to add a new node to the list (push)
    void push(Node newNode){
        if (head == null) {  // If the list is empty
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Method to remove the last node from the list (pop)
    void pop(){
        if (tail == null) {  // If the list is empty
            System.out.println("The list is empty");
        } else if (tail.prev == null) {  // If the list has only one element
            System.out.println(tail.data + " removed");
            head = null;
            tail = null;
        } else {  // If the list has more than one element
            System.out.println(tail.data + " removed");
            tail = tail.prev;
            tail.next = null;
        }
    }
}
