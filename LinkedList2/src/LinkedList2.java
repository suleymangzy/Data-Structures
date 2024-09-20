public class LinkedList2 {
    int data;
    LinkedList2 next;

    LinkedList2(int data) {
        this.data = data;
        next = null;
    }

    LinkedList2(int data, LinkedList2 next) {
        this.data = data;
        this.next = next;
    }

    static LinkedList2 remove(int index, LinkedList2 head) {
        if (head == null) {
            return null; // If the list is empty, return null
        }

        if (index == 1) {
            return head.next; // Remove the head node
        }

        LinkedList2 current = head;
        for (int i = 1; i < index - 1 && current != null; i++) {
            current = current.next;
        }

        if (current != null && current.next != null) {
            current.next = current.next.next; // Bypass the node to be removed
        }

        return head; // Return the modified list
    }

    static LinkedList2 moveNegativeToFront(LinkedList2 head) {
        if (head == null) {
            return null; // If the list is empty, return null
        }

        LinkedList2 current = head;
        LinkedList2 prev = null;
        int index = 0;

        // Find the first negative node
        while (current != null) {
            index++;
            if (current.data < 0) {
                // Remove the negative node
                head = remove(index, head);
                // Move it to the front
                LinkedList2 negativeNode = new LinkedList2(current.data, head);
                return negativeNode; // Return the new head
            }
            prev = current;
            current = current.next;
        }
        return head; // No negative node found, return original head
    }
}

