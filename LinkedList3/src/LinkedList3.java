public class LinkedList3 {
    String studentName;
    String studentSurname;
    int studentNumber;
    LinkedList3 next;
    LinkedList3 previous;

    LinkedList3(String studentName, String studentSurname, int studentNumber) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentNumber = studentNumber;
        next = null;
        previous = null;
    }
}
