import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hashtable<Integer, LinkedList<String>> ht = new Hashtable<>();
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();

        ht.put(1, list1);
        ht.put(2, list2);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the key:");
            int key = input.nextInt();
            if (ht.containsKey(key)) {
                System.out.println("Enter the value:");
                String value = input.next();
                ht.get(key).addFirst(value);
            } else {
                System.out.println("Key not found. Please enter a valid key.");
            }
        }

        System.out.println("HashTable contents: " + ht);
    }
}
