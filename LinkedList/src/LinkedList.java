public class LinkedList {
    int data;
    LinkedList next;
    LinkedList previous;

    LinkedList(int data) {
        this.data = data;
        next = null;
        previous = null;
    }

    LinkedList(int data, LinkedList next) {
        this.data = data;
        this.next = next;
        previous = null;
    }
}
