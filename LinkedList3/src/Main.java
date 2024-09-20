import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many students will you enter data for? " +
                "\n(You must enter data for at least two students)");
        int studentCount = input.nextInt();
        LinkedList3 head = null;
        LinkedList3 current = null;

        for (int i = 1; i <= studentCount; i++) {
            System.out.println("Enter the name of student " + i + ":");
            String studentName = input.next();
            System.out.println("Enter the surname of student " + i + ":");
            String studentSurname = input.next();
            System.out.println("Enter the number of student " + i + ":");
            int studentNumber = input.nextInt();

            LinkedList3 newStudent = new LinkedList3(studentName, studentSurname, studentNumber);

            if (head == null) {
                head = newStudent;
                current = newStudent;
            } else {
                current.next = newStudent;
                newStudent.previous = current;
                current = newStudent;
            }
        }

        int requestedStudent;
        do {
            System.out.println("Press 1 for the previous student, or 2 for the next student.");
            requestedStudent = input.nextInt();

            if (requestedStudent == 1 && current.previous != null) {
                current = current.previous;
                System.out.print("Previous student's name: " + current.studentName);
                System.out.println("");
                System.out.print("Previous student's surname: " + current.studentSurname);
                System.out.println("");
                System.out.print("Previous student's number: " + current.studentNumber);
                System.out.println("");
            } else if (requestedStudent == 2 && current.next != null) {
                current = current.next;
                System.out.print("Next student's name: " + current.studentName);
                System.out.println("");
                System.out.print("Next student's surname: " + current.studentSurname);
                System.out.println("");
                System.out.print("Next student's number: " + current.studentNumber);
                System.out.println("");
            }
        } while (requestedStudent == 1 || requestedStudent == 2);
    }
}