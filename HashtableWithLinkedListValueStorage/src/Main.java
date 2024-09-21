import java.util.LinkedList;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hashtable<Integer, LinkedList<String>> ht = new Hashtable<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a key... (enter -1 to exit)");
        int key = input.nextInt();

        while (key != -1) {
            System.out.println("Enter a value...");
            String value = input.next();
            if (ht.containsKey(key)) {
                ht.get(key).addFirst(value);
            } else {
                LinkedList<String> list = new LinkedList<>();
                list.addFirst(value);
                ht.put(key, list);
            }
            System.out.println("Enter a key... (enter -1 to exit)");
            key = input.nextInt();
        }

        System.out.println("Table size -> " + ht.size());
        System.out.println("Contents of the table: " + ht);
    }
}