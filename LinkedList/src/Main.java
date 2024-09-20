import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int studentCount = input.nextInt();

        System.out.println("Enter the grade of the 1st student:");
        int studentGrade = input.nextInt();

        LinkedList student = new LinkedList(studentGrade);

        for (int i = 2; i <= studentCount; i++) {
            System.out.println("Enter the grade of the " + i + "th student:");
            studentGrade = input.nextInt();
            student = new LinkedList(studentGrade, student);
        }

        LinkedList start = student;

        for (int i = studentCount; i > 0; i--) {
            if (start != null) {
                System.out.println("Grade of student " + i + " -> " + start.data);
                start = start.next;
            }
        }

        input.close(); // Close the scanner to avoid resource leaks
    }
}