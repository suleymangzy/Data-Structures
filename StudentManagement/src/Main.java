import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<HashMap<String, String>> studentList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            HashMap<String, String> studentInfo = new HashMap<>();

            System.out.println("Enter details for Student " + (i + 1) + ":");

            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
            studentInfo.put("FirstName", firstName);

            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
            studentInfo.put("LastName", lastName);

            System.out.print("Midterm Grade: ");
            int midtermGrade = Integer.parseInt(scanner.nextLine());
            studentInfo.put("Midterm", String.valueOf(midtermGrade));

            System.out.print("Final Grade: ");
            int finalGrade = Integer.parseInt(scanner.nextLine());
            studentInfo.put("Final", String.valueOf(finalGrade));

            float average = (finalGrade * 0.6f) + (midtermGrade * 0.4f);
            studentInfo.put("Average", String.valueOf(average));

            studentList.add(studentInfo);
        }

        System.out.println("Student List:");
        for (HashMap<String, String> student : studentList) {
            System.out.print("First Name: " + student.get("FirstName") + ", ");
            System.out.print("Last Name: " + student.get("LastName") + ", ");
            System.out.print("Midterm Grade: " + student.get("Midterm") + ", ");
            System.out.print("Final Grade: " + student.get("Final") + ", ");
            System.out.print("Average: " + student.get("Average"));
            System.out.println();
        }

        System.out.print("\nEnter the first and last name of the student to search:\nFirst Name: ");
        String searchFirstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String searchLastName = scanner.nextLine();

        boolean studentFound = false;
        for (HashMap<String, String> student : studentList) {
            String firstName = student.get("FirstName");
            String lastName = student.get("LastName");
            if (firstName.equalsIgnoreCase(searchFirstName) && lastName.equalsIgnoreCase(searchLastName)) {
                System.out.println("\nStudent Information:");
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("Midterm Grade: " + student.get("Midterm"));
                System.out.println("Final Grade: " + student.get("Final"));
                System.out.println("Average: " + student.get("Average"));
                studentFound = true;
                break;
            }
        }

        if (!studentFound) {
            System.out.println("\nStudent not found.");
        }

        scanner.close();
    }
}
