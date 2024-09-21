public class LinkedList {
    Node head;
    Node tail;

    // Method to add a node at the beginning of the list
    public void addAtBeginning(Node n) {
        if (head == null) {  // If the list is empty
            head = n;
            tail = n;
        } else {
            n.next = head;
            head.prev = n;
            head = n;
        }
    }

    // Method to add a node at the end of the list
    public void addAtEnd(Node n) {
        if (tail == null) {  // If the list is empty
            head = n;
            tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }

    // Method to remove a node from the beginning of the list
    public void removeFromBeginning() {
        if (head != null) {
            if (head == tail) {  // If there's only one element
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;  // Update the new head's previous reference
            }
        } else {
            System.out.println("The list is empty");
        }
    }

    // Method to remove a node from the end of the list
    public void removeFromEnd() {
        if (head != null) {
            if (tail == head) {  // If there's only one element
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;  // Update the new tail's next reference
            }
        } else {
            System.out.println("The list is empty");
        }
    }

    // Method to print the list
    public void print() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + "-");
            tmp = tmp.next;
        }
        System.out.println("  ");
    }
}
