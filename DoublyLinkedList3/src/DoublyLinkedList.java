public class DoublyLinkedList {
    Node head;
    Node tail;

    // Constructor to initialize an empty list
    DoublyLinkedList() {
        head = null;
        tail = null;
    }

    // Method to add a node to the end of the list
    void enqueue(Node n) {
        if (head == null) {  // If the list is empty
            head = n;
            tail = n;
        } else {
            tail.next = n;  // Link the new node to the end
            n.prev = tail;  // Set the previous link for the new node
            tail = n;       // Update the tail to the new node
        }
    }

    // Method to remove a node from the front of the list
    void dequeue() {
        if (head == null) {
            System.out.println("The list is empty");
        } else if (head.next == null) {  // If there's only one element
            head = null;
            tail = null;  // Clear the tail as well
        } else {
            head = head.next;  // Move head to the next node
            head.prev = null;  // Clear the previous reference of the new head
        }
    }

    void print() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

}
